package DSA.DSA3.BackTracking;
import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        List<String> result = new ArrayList<>();
        boolean[] visited = new boolean[str.length()];
        permute(str, "", visited, result);
        System.out.println(result);
    }

    public static void permute(String str,
                               String current,
                               boolean[] visited,
                               List<String> result) {

        if (current.length() == str.length()) {
            result.add(current);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            if (visited[i]) {
                continue;
            }

            visited[i] = true;

            permute(str,
                    current + str.charAt(i),
                    visited,
                    result);

            // Backtracking
            visited[i] = false;
        }
    }

    
}
