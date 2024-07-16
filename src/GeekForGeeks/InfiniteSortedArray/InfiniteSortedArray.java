package GeekForGeeks.InfiniteSortedArray;

import java.util.Arrays;

public class InfiniteSortedArray {

    static int binarySearch(int start, int end, int arr[], int target) {
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Arrays.sort(arr);
        int start = 0;
        int end = 1;
        int target = 10;

        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        System.out.println(start);
        System.out.println(end);

        System.out.println(binarySearch(start, end, arr, target));
    }
}
