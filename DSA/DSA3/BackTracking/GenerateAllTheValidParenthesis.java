package DSA.DSA3.BackTracking;

public class GenerateAllTheValidParenthesis {
    public static void main(String[] args) {
        int n = 3;
        generateAllParenthesis("", 0, 0, n);
    }

    public static void generateAllParenthesis(String str, int opening, int closing, int A){
        if(str.length() == 2*A){
            System.out.println(str);
            return;
        }
        if(opening < A){
            generateAllParenthesis(str+"(", opening+1, closing, A);
        }
        if(opening > closing){
            generateAllParenthesis(str+")", opening, closing+1, A);
        }
    }
}
// TC- O(2^(2*A)) SC- O(2*A)