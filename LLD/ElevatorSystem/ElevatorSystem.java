package LLD.ElevatorSystem;

import java.util.List;
import java.util.TreeSet;

enum Direction {
    UP,
    DOWN,
    IDLE
}

enum RequestType {
    INTERNAL,  // pressed inside the cabin → destination floor
    EXTERNAL   // pressed on a floor → direction button
}

enum ElevatorState {
   IDLE, MOVING_UP, MOVING_DOWN, STOPPED, MAINTENANCE
}

class ElevatorDisplay {
    private final int elevatorId;

    public ElevatorDisplay(int elevatorId) {
        this.elevatorId = elevatorId;
    }

    public void show(int currentFloor, Direction direction, ElevatorState state) {
        System.out.printf("[Elevator-%d Display] Floor: %d | Direction: %s | State: %s%n",
            elevatorId, currentFloor, direction, state);
    }
}

class Elevator{
    private final int id;
    private int currentFloor;
    private Direction direction;
    private ElevatorState state;
    private final ElevatorDisplay display;

    // Floors to visit going UP (ascending)
    private final TreeSet<Integer> upQueue;
    // Floors to visit going DOWN (descending)
    private final TreeSet<Integer> downQueue;

    public Elevator(int id) {
        this.id = id;
        this.currentFloor = 0;
        this.direction = Direction.IDLE;
        this.state = ElevatorState.IDLE;
        this.display = new ElevatorDisplay(id);
        this.upQueue = new TreeSet<>();
        this.downQueue = new TreeSet<>();
    }

    public synchronized void addRequest(Request request) {
        int floor = request.getFloor();

        if (floor > currentFloor) {
            upQueue.add(floor);
        } else if (floor < currentFloor) {
            downQueue.add(floor);
        } else {
            // Already here — open doors immediately
            openDoors();
        }

        System.out.printf("[Elevator-%d] Request added → %s | upQ=%s | downQ=%s%n",
            id, request, upQueue, downQueue);

        if (state == ElevatorState.IDLE) {
            processRequests();
        }
    }
}

class Request {
    private final int floor;
    private final Direction direction;
    private final RequestType type;
    private final long timestamp;

    public Request(int floor, Direction direction, RequestType type) {
        this.floor = floor;
        this.direction = direction;
        this.type = type;
        this.timestamp = System.currentTimeMillis();
    }

    public int getFloor()            { return floor; }
    public Direction getDirection()  { return direction; }
    public RequestType getType()     { return type; }
    public long getTimestamp()       { return timestamp; }

    @Override
    public String toString() {
        return String.format("Request[floor=%d, dir=%s, type=%s]", floor, direction, type);
    }
}

interface ElevatorScheduler {
    void scheduleElevator(Elevator elevator, int requestedFloor);
}

class SCANScheduler implements ElevatorScheduler {

    @Override
    public Elevator selectElevator(List<Elevator> elevators, Request request) {
        Elevator best = null;
        int minCost = Integer.MAX_VALUE;

        for (Elevator elevator : elevators) {
            if (elevator.getState() == ElevatorState.MAINTENANCE) continue;

            int cost = computeCost(elevator, request);
            if (cost < minCost) {
                minCost = cost;
                best = elevator;
            }
        }
        return best;
    }

    // Cost function:
    //   If elevator is idle                → just the distance
    //   If elevator is going same direction and request is on the way → distance only
    //   If elevator must reverse to serve  → distance + full current travel penalty
    //
    // SCALABLE EXPANSION:
    //   → Factor in load (passengers inside) : multiply cost by loadFactor
    //   → Factor in energy                   : prefer already-moving elevators
    //   → Factor in wait time SLA            : boost cost if request is old (timestamp gap)
    private int computeCost(Elevator elevator, Request request) {
        int distance = Math.abs(elevator.getCurrentFloor() - request.getFloor());

        if (elevator.getState() == ElevatorState.IDLE) {
            return distance;
        }

        // Elevator moving UP, request wants UP, and request floor is above current → on the way
        if (elevator.getDirection() == Direction.UP
                && request.getDirection() == Direction.UP
                && request.getFloor() >= elevator.getCurrentFloor()) {
            return distance;
        }

        // Elevator moving DOWN, request wants DOWN, and request floor is below current → on the way
        if (elevator.getDirection() == Direction.DOWN
                && request.getDirection() == Direction.DOWN
                && request.getFloor() <= elevator.getCurrentFloor()) {
            return distance;
        }

        // Must reverse or not on the way → penalise heavily
        return distance + 100;
    }
}



class ElevatorController{
    List<Elevator> elevators;
    private final ElevatorScheduler scheduler;

}
public class ElevatorSystem {
    public static void main(String[] args) {
        ElevatorController controller = new ElevatorController(2, 10, new SCANScheduler());

    }
}
