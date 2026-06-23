package DSA.DSA1.Arrays1D;

public class Flip {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int[] resp = new int[2];
        int start = 0;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                currentSum++;
            } else {
                currentSum--;
            }
            if(maxSum < currentSum){
                maxSum = currentSum;
                resp[0] = start + 1;
                resp[1] = i + 1;
            }
            if(currentSum < 0){
                currentSum = 0;
                start = i + 1;
            }
            
        }
        if(maxSum<=0){
            System.out.println("No flip possible");
        }else{
            System.out.println("Flip from index " + resp[0] + " to index " + resp[1]);
        }
    }
}
