package DSA.DSA3.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllSubsets {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> resp = generateSubSets(arr);
        for(List<Integer> ele : resp){
            System.out.println(ele);
        }
    }

    public static List<List<Integer>> generateSubSets(int[] arr){
        List<List<Integer>> resp = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        generateSubset(arr, 0, curr, resp);
        return resp;
    }

    public static void generateSubset(int[] arr, int index, List<Integer> curr, List<List<Integer>> resp){
        if(index == arr.length){
            resp.add(new ArrayList<>(curr));
            return;
        }
        // include the element
        curr.add(arr[index]);
        generateSubset(arr, index+1, curr, resp);
        // exclude the element
        curr.remove(curr.size()-1);
        generateSubset(arr, index+1, curr, resp);
    }

}