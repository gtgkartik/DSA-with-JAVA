# Search in Rotated Sorted Array

## Intuition

This solution is designed to search for a target value in a rotated sorted array. The key insight is that a rotated sorted array consists of two sorted subarrays. The algorithm first finds the pivot point (the largest element), which is the boundary between these two subarrays. Then, it determines which subarray the target is in and performs a binary search on that subarray.

## Algorithm Breakdown

1. **Find the Pivot**:
    - Use a modified binary search to find the pivot point.
    - The pivot is the largest element in the array, where the next element is smaller.

2. **Determine Search Range**:
    - If no pivot is found (array is not rotated), search the entire array.
    - If the target is the pivot, return the pivot index.
    - If the target is greater than or equal to the first element, search the left subarray.
    - Otherwise, search the right subarray.

3. **Binary Search**:
    - Perform a standard binary search on the determined range.

## Walkthrough

Let's walk through the process with an example:

Array: [4, 5, 6, 7, 0, 1, 2]
Target: 0

1. Find Pivot:
    - The `findPivot` method will return 3 (index of 7).

2. Determine Search Range:
    - Target (0) is less than arr[0] (4), so search in the right subarray.

3. Binary Search:
    - Perform binary search from index 4 to 6.
    - Find and return the index of 0 (which is 4).

## Example

Input:
```java
int[] arr = {4, 5, 6, 7, 0, 1, 2};
int target = 0;
```
