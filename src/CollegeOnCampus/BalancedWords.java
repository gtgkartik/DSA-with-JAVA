package CollegeOnCampus;

public class BalancedWords {

    public static int countBalancedWords(int n, int d) {
        // Define the number of characters in the alphabet
        final int ALPHABET_SIZE = 26;
        int[][] dp = new int[n][ALPHABET_SIZE];

        // Base case: For words of length 1, every single character is valid
        for (int j = 0; j < ALPHABET_SIZE; j++) {
            dp[0][j] = 1;
        }

        // Fill the DP table
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < ALPHABET_SIZE; j++) {
                dp[i][j] = 0;
                // Consider all characters within the range defined by d
                for (int k = Math.max(0, j - d); k <= Math.min(ALPHABET_SIZE - 1, j + d); k++) {
                    dp[i][j] += dp[i - 1][k];
                }
            }
        }

        // Calculate the total number of balanced words of length n
        int result = 0;
        for (int j = 0; j < ALPHABET_SIZE; j++) {
            result += dp[n - 1][j];
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 2; // Length of the word
        int d = 3; // Maximum allowed difference
        System.out.println("Number of balanced words of length " + n + " is: " + countBalancedWords(n, d));
    }
}
