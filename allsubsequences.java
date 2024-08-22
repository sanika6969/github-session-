import java.util.ArrayList;
import java.util.List;

public class allsubsequences {
    // Method to find all subsequences of a string
    static void findSubsequences(String s, int index, String current, List<String> result) {
        // Base case: If we've reached the end of the string
        if (index == s.length()) {
            result.add(current);
            return;
        }

        // Include the current character
        findSubsequences(s, index + 1, current + s.charAt(index), result);

        // Exclude the current character
        findSubsequences(s, index + 1, current, result);
    }

    public static void main(String[] args) {
        String s = "abc";
        List<String> result = new ArrayList<>();
        
        // Find all subsequences
        findSubsequences(s, 0, "", result);

        // Print all subsequences
        System.out.println("All subsequences of the string \"" + s + "\":");
        for (String subsequence : result) {
            System.out.println(subsequence);
        }
    }
}