# Finding a Target in an Infinite Sorted Array
[Problem Link GFG](https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/)

- Asked in Amazon
- Topic: Binary Search


# Prerequisite

## Binary Search

## Finding the Length of a Subarray given the start and end index values

To find the length of a subarray given the start and end indices, use the formula:

## Example

Given an array `arr[]` and the subarray defined by `start` and `end` indices:

```java
int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int start = 2;  // Starting index of the subarray
int end = 5;    // Ending index of the subarray

int length = end - start + 1;
System.out.println("Length of the subarray: " + length);
```

## Intuition
The problem is to find the position of a target element in an infinitely sorted array. Since the array is infinite, we can't determine its length. The goal is to find the target element efficiently using a combination of exponential search and binary search.

### Steps

#### Exponential Search to Find Range:
1. Start with a small range `[start, end]` where `start = 0` and `end = 1`.
2. Double the size of the range exponentially until the target is within the range.
3. This is efficient because it quickly expands the search space.

#### Binary Search within Range:
1. Once the range is determined, use binary search within this range to find the exact position of the target.

## Example Walkthrough
Let's use the provided array and target value for the example: `arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}` and `target = 10`.

### Step 1: Exponential Search
#### Initialization:
- `start = 0`
- `end = 1`

#### Expand Range:
1. Check if `target > arr[end]`. If true, expand the range.
    - `target = 10`, `arr[end] = arr[1] = 2` (since `target > arr[1]`):
        - `temp = end + 1 = 2`
        - `end = end + (end - start + 1) * 2 = 1 + (1 - 0 + 1) * 2 = 5`
        - `start = temp = 2`
    - while expanding check how you are updating the start and end indices simultaneously

#### Repeat Expansion:
2. Now `start = 2` and `end = 5`.
    - `target = 10`, `arr[end] = arr[5] = 6` (since `target > arr[5]`):
        - `temp = end + 1 = 6`
        - `end = end + (end - start + 1) * 2 = 5 + (5 - 2 + 1) * 2 = 11`
        - `start = temp = 6`

#### Repeat Expansion:
3. Now `start = 6` and `end = 11`.
    - `target = 10`, `arr[end] = arr[11] = 12` (since `target <= arr[11]`):
        - Stop expanding as the target is within the range.

At this point, we have `start = 6` and `end = 11`.

### Step 2: Binary Search within Range
#### Initial Range:
- `start = 6`, `end = 11`

#### Binary Search:
1. Calculate `mid = start + (end - start) / 2 = 6 + (11 - 6) / 2 = 8`
    - `arr[mid] = arr[8] = 9` (since `arr[mid] < target`, update `start = mid + 1 = 9`)

2. Repeat:
    - Calculate `mid = start + (end - start) / 2 = 9 + (11 - 9) / 2 = 10`
    - `arr[mid] = arr[10] = 10` (since `arr[mid] == target`, return `mid = 10`)

So, the position of the target `10` in the array is `10`.
