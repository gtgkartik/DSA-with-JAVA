package ION;

import java.util.* ;
public class GetAnagramPeriod {
    public static int getAnagramPeriod(String input_str) {
        int n = input_str.length();

        // Iterate over all possible lengths for the smallest string
        for (int length = 1; length <= n; length++) {
            if (n % length == 0) {
                String sub = input_str.substring(0, length);
                boolean isAnagramPeriod = true;

                // Check each chunk of length `length` to see if it's an anagram of `sub`
                for (int i = 0; i < n; i += length) {
                    String chunk = input_str.substring(i, i + length);
                    if (!areAnagrams(sub, chunk)) {
                        isAnagramPeriod = false;
                        break;
                    }
                }

                if (isAnagramPeriod) {
                    return length;
                }
            }
        }
        return n; // In the worst case, the whole string itself is the smallest.
    }

    private static boolean areAnagrams(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String input_str = "bbaaababababaabb";
        System.out.println(getAnagramPeriod(input_str)); // Output should be 3
    }
}
