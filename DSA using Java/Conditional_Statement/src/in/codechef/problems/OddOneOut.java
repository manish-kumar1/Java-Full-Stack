package in.codechef.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddOneOut {

    public static String findOdd(List<String> series) {
        List<int[]> differencesList = new ArrayList<>();
        
        // Calculate the difference arrays for each string
        for (String s : series) {
            int[] differences = new int[s.length() - 1];
            for (int i = 0; i < s.length() - 1; i++) {
                differences[i] = s.charAt(i + 1) - s.charAt(i);
            }
            differencesList.add(differences);
        }

        // Check for the odd pattern by comparison
        for (int i = 0; i < series.size(); i++) {
            boolean isOdd = true;
            for (int j = 0; j < series.size(); j++) {
                if (i != j && Arrays.equals(differencesList.get(i), differencesList.get(j))) {
                    isOdd = false;
                    break;
                }
            }
            if (isOdd) {
                return series.get(i);  // Return the odd one out
            }
        }

        return "";  // Return empty string if no odd one is found (edge case)
    }

    public static void main(String[] args) {
        List<String> series = Arrays.asList("ACB", "BDC", "CED", "DEF");
        
        System.out.println(findOdd(series));  // Expected output: "DEF"
    }
}
