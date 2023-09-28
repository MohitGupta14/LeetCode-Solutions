class Solution {
    public int maxFrequency(int[] nums, int k) {
        
        int n = nums.length;
        int r = 0;
        long  sum =0;
        int l =0;
        int res = 0;
        Arrays.sort(nums);
        while(r< n){
            sum = sum + nums[r];

            while((long)(r-l+1)*nums[r] > sum+k){
                sum -= nums[l];
                l++;
            }

            res = Math.max(res,r-l+1);
            r++;
        }

        return res;
    }
}