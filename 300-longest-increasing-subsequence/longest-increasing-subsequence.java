class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] arr = new int[nums.length];
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int currElem = nums[i];
            int temp = 1; 
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    temp = Math.max(temp, arr[j] + 1);
                }
            }
            arr[i] = temp;
            ans = Math.max(ans, arr[i]);
        }

        return ans;
    }
}
