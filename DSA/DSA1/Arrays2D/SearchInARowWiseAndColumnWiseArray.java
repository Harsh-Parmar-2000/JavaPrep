package DSA.DSA1.Arrays2D;

public class SearchInARowWiseAndColumnWiseArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        int target = 249;
        int n = arr.length;
        int m = arr[0].length;
        int i = 0, j = m-1;
        while(i < n && j >= 0){
            if(arr[i][j] == target){
                System.out.println("Target found at i "+ i +" j "+j);
                System.exit(0);
            }
            else if(arr[i][j] < target){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println("Not Found");
    }
}
