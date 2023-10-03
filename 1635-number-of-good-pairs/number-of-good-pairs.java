class Solution {
    public int numIdenticalPairs(int[] nums) {
        int i = 0;
        int ans = 0; 

        while(i< nums.length+1){

            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    ans++;
                }
            }
            i++;
        }

        return ans;
    }
}