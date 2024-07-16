# Peak Index of Mountain Array 


- Asked in Google, Facebook, Amazon, Microsoft, Apple

## Prerequesitie
- Binary search
## What is a bitonic array 
A bitonic array is an array that consists of a monotonically increasing sequence followed by a monotonically decreasing sequence. In other words, it has a single peak element, after which the elements decrease in value.

The `PeakIndexOfMountainArraySolution1` is a brute force approach 

- Iterating thougth all the elements and storing the value of the element and the corresponding index in the hashmap.
- Now sort the array and return the last element in the hashmap which is supposed to be the peak element. 

This is a `brute force approach`.\
This is `O(n*log(n) + n)` solution because we are sorting and iterating througth the array once
Brute force solution.

Better Approach using `O(log(n))`. \

##### Using `Binary Search` in `PeakIndexOfMountainArraySolution2`

### Finding the Peak Element in an Array

To find a peak element in an array (an element that is greater than its neighbors), follow these steps:

1. **Initialize Pointers**:
    - Initialize two pointers, `left` and `right`, to the first and last elements of the array, respectively.

2. **Binary Search for Peak**:
    - While `left` is less than or equal to `right`:
        1. Calculate the midpoint `mid` of the range `[left, right]`.
        2. If the element at index `mid` is greater than its neighbors (i.e., `arr[mid] > arr[mid-1]` and `arr[mid] > arr[mid+1]`), then `mid` is the peak element.
        3. If the element at index `mid` is less than its right neighbor, then the peak element must be in the right half of the array. Set `left` to `mid + 1`.
        4. Otherwise, the peak element must be in the left half of the array. Set `right` to `mid - 1`.
