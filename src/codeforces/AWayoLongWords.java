package codeforces;

import java.util.Scanner;

public class AWayoLongWords {

    static String shorten(String s) {
        if (s.length() <= 10) {
            return s;
        }
        return s.charAt(0) + String.valueOf(s.length() - 2) + s.charAt(s.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character left after nextInt()
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        for (String s : arr) {
            System.out.println(shorten(s));
        }
    }
}
