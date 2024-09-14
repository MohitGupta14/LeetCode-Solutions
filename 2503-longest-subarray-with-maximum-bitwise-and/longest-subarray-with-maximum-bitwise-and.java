class Solution {
    public int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        int length = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                length++; 
                maxLength = Math.max(maxLength, length);
            } else {
                length = 0; 
            }
        }

        return maxLength;
    }
}
