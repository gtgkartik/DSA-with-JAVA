# FInd mountain element in a mountain array 

here mountian array is a bitonic array 

### Intuition and Step-by-Step Walkthrough

#### Intuition

In this problem, we are dealing with a bitonic array, which is an array that first increases and then decreases. Given such an array, our goal is to find a target value efficiently. The strategy leverages the properties of binary search and the structure of the bitonic array:

1. **Find the Peak**: The peak is the highest point in the bitonic array. The array is strictly increasing up to this point and strictly decreasing after it.
2. **Binary Search in the Ascending Part**: Perform a binary search in the increasing portion of the array (from the start to the peak).
3. **Binary Search in the Descending Part**: If the target is not found in the increasing part, perform a binary search in the decreasing portion of the array (from the peak to the end).

This approach ensures that we search the array efficiently in \(O(\log n)\) time complexity.

#### Step-by-Step Example Walkthrough

Let's walk through an example using the given array and target:

```java
int arr[] = {1, 2, 2, 4, 5, 3, 1};
int target = 3;
```
### Step-by-Step Example Walkthrough

#### Step 1: Find the Peak
We use the `findPeak` method to determine the peak of the array:

1. Initialize `start = 0` and `end = arr.length - 1`.
2. Perform binary search to find the peak:
    - `mid = start + (end - start) / 2`
    - Compare `arr[mid]` and `arr[mid + 1]`
    - If `arr[mid] > arr[mid + 1]`, the peak is on the left side, so set `end = mid`.
    - Otherwise, the peak is on the right side, so set `start = mid + 1`.
3. The loop continues until `start == end`, and `start` (or `end`) is the index of the peak.

For the array `{1, 2, 2, 4, 5, 3, 1}`, the peak is found at index 4 with value 5.

#### Step 2: Binary Search in the Ascending Part
We use the `searchAscending` method to search for the target in the ascending part:

1. Initialize `start = 0` and `end = peak`.
2. Perform binary search:
    - `mid = start + (end - start) / 2`
    - Compare `arr[mid]` with `target`
    - If `target < arr[mid]`, move to the left subarray (`end = mid - 1`).
    - If `target > arr[mid]`, move to the right subarray (`start = mid + 1`).
    - If `target == arr[mid]`, return `mid`.
3. If the loop ends without finding the target, return `-1`.

For the target `3`, it is not found in the ascending part `{1, 2, 2, 4, 5}`.

#### Step 3: Binary Search in the Descending Part
If the target is not found in the ascending part, we use the `searchDescending` method to search for it in the descending part:

1. Initialize `start = peak` and `end = arr.length - 1`.
2. Perform binary search:
    - `mid = start + (end - start) / 2`
    - Compare `arr[mid]` with `target`
    - If `target < arr[mid]`, move to the right subarray (`start = mid + 1`).
    - If `target > arr[mid]`, move to the left subarray (`end = mid - 1`).
    - If `target == arr[mid]`, return `mid`.
3. If the loop ends without finding the target, return `-1`.

For the target `3`, it is found in the descending part `{5, 3, 1}` at index 5.

#### Conclusion
The program first finds the peak of the bitonic array and then performs binary search in both the ascending and descending parts to locate the target value. This approach ensures that the search is efficient, with a time complexity of \(O(\log n)\).
