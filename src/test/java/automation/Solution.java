package automation;
import java.util.HashSet;

public class Solution {

    // Given a string and size of the tuples, extracts all unique tuples (substrings) of the given size.
    public static HashSet<String> uniqueTuples(String input, int len) {
        HashSet<String> result = new HashSet<>();
        
        // TODO: Implement solution
        if (input == null || len <= 0 || input.length() < len) {
            return result; // Return empty set if input is invalid
        }
        
        for (int i = 0; i <= input.length() - len; i++) {
            String tuple = input.substring(i, i + len);
            result.add(tuple);
        }
        
        return result;
    }

    public static boolean doTestsPass() {
        // Returns true if the tests pass. Otherwise, returns false.
        
        // TODO: Implement some tests, please
        String input = "aab";
        HashSet<String> result = uniqueTuples(input, 2);

        // Simple test case
        if (result.contains("aa") && result.contains("ab") && result.size() == 2) {
            System.out.println("Test passed.");
            return true;
        } else {
            System.out.println("Test failed.");
            return false;
        }
    }

    public static void main(String[] args) {
        doTestsPass();
    }
}
