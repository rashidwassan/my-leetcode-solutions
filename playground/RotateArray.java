package playground;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = {};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices = new int[] { i, j };
                }
            }
        }
        return indices;
    }

}