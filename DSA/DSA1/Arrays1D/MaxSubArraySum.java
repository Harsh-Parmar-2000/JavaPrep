package DSA.DSA1.Arrays1D;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArraySum(arr);
        System.out.println("Maximum Subarray Sum: " + maxSum);

        int[] startEnd = maxSubArraySumWithIndices(arr);
        System.out.println("Maximum Subarray Sum: " + maxSum + ", Start Index: " + startEnd[0] + ", End Index: " + startEnd[1]);
    }
    
    // BF- Consider all the subarrays for every subarray iterate and find the sum 
    // TC- O(N^3) SC- O(1)

    // Better -
    // Using pSum =>  TC- O(N^2) SC- O(N) & Carry Forward = TC- O(N^2) SC- O(N)
  
    // Optimized
    // Kadane's Algorithm TC- O(N) SC- O(1)
    public static int maxSubArraySum(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            max = Math.max(max, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }

    // have to find the start & end index
    public static int[] maxSubArraySumWithIndices(int[] arr){
        int startInd = 0;
        int endInd = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(max <= sum){
                max = sum;
                endInd = i;
            }

            if(sum < 0){
                sum = 0;
                startInd = i+1;
            }
        }
        return new int[]{startInd, endInd};
    }
}
