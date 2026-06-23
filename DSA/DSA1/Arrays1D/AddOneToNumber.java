package DSA.DSA1.Arrays1D;

import java.util.Arrays;

public class AddOneToNumber {
    public static void main(String[] args) {
        int[] arr1 = {0,0,0};
        int[] arr2 = {1,2,3};
        int[] arr3 = {9,9,9};

        System.out.println("arr1 "+ Arrays.toString(addOneToNumber(arr1)));
        
        System.out.println("arr1 "+ Arrays.toString(addOneToNumber(arr2)));

        System.out.println("arr1 "+Arrays.toString(addOneToNumber(arr3)));
    }

    public static int[] addOneToNumber(int[] arr){
        int i = 0;
        int n = arr.length;

        while(i < n && arr[i] == 0){
            i++;
        }

        if(i == n){
            return new int[]{1};
        }

        for(int j = n-1; j >= 0; j--){
            if(arr[j] < 9){
                arr[j]++;
                return Arrays.copyOfRange(arr, i, n);
            }
            arr[j] = 0;
        }

        int[] resp = new int[n-i+1];
        resp[0] = 1;
        return resp; 
    }
}
