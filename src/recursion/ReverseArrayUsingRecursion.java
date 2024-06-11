package recursion;

public class ReverseArrayUsingRecursion {

    static void swap(int[] arr, int a, int b) {
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void reverse(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        swap(arr, l, r);
        reverse(arr, l + 1, r - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int l = 0;
        int r = arr.length - 1;

        reverse(arr, l, r);

        // Print the reversed array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
