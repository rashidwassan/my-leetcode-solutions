## Given an array, rotate the array to the right by `k` steps, where `k` is non-negative.

> Example
```dart
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
```

>Solution
```Java
class Solution {
    public void rotate(int[] nums, int k) {
        // creating a temporary array
        int[] temp = new int[nums.length];
        // storing last elements of `nums` into first of new array
        for (int i = 0; i < nums.length; i++) {
            // here ((i + k) % nums.length) give first indices -
            // when the end of array is reached.
            temp[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }
}
```