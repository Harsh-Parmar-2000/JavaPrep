## To Design a Elevator System
    We are going to create a system which supports Multiple Elevators & Inside Outside requests 
    1. initialize elevators
        ElevatorController controller = new ElevatorController(2, 10, new SCANScheduler());
        there in ElevatorController we should have to initialize the floors and count of elevators with the Scheduling algo
        So will create a constructor and initialize this

    2. ElevatorController will have requestElevator Method
        for that request we have to select the bestElevator
        We can create multiple types of algorithms 
        // Scan(Look) algorithm  
        // NearestCarScheduler  : pick elevator with min distance
        //   → LoadBalancedScheduler: pick elevator with fewest requests
        //   → ZoneScheduler        : floors 1-10 → elevator bank A, 11-20 → bank B
        //   → MLScheduler          : predict load using historical data

    