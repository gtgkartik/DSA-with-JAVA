package LeetCodePractise.IsSubsequence;
import java.util.* ;
public class IsSubsequence {

    static ArrayList<ArrayList<Integer>> subsequences(ArrayList<Integer> empty, int index, int arr[]) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (index == arr.length) {
            result.add(new ArrayList<>(empty));
            return result;
        }
        // Include the current element
        empty.add(arr[index]);
        result.addAll(subsequences(empty, index + 1, arr));

        // Exclude the current element (backtrack)
        empty.remove(empty.size() - 1);
        result.addAll(subsequences(empty, index + 1, arr));

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<Integer> empty = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = subsequences(empty, 0, arr);
        for (ArrayList<Integer> list : result) {
            System.out.println(list);
        }
    }
}
