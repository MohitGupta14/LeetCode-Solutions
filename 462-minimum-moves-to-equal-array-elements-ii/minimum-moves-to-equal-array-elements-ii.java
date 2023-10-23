class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int target = nums[nums.length/2];
        
        int ans = 0;
        for(int i = 0 ; i< nums.length;i++){
        
            ans = ans + Math.abs(nums[i]-target);
        }
        
        return ans;
    }
}