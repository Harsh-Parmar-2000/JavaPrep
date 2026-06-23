package DSA.DSA1.Arrays2D;

public class RowsWithMaximumOnes {
    public static void main(String[] args) {
        int[][] arr =  {{0,0,0,0,1},
                        {0,0,1,1,1},
                        {0,0,0,0,1},
                        {0,1,1,1,1},
                        {0,0,1,1,1},
                       };
        int n = arr.length, m = arr[0].length;
        int i = 0, j = m - 1;
        int ans = 0;
        while(i < n && j >= 0){
            if(arr[i][j] == 1){
                ans = i;
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println(ans);
    }
}
// BF- for every row iterate & count the no of 1's 
// TC- O(N*M) SC- O(1)