class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int mul =1;
        int mul2 =1;
        int temp = 0;
        for(int i = 0 ; i < nums.length;i++){
            mul = mul*nums[i];
            if(nums[i] != 0){
                mul2= mul2*nums[i];
            }else{
                temp++;
            }
        }
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i] != 0 ){
             ans[i] = mul/nums[i];
            }
            if(temp< 2 && nums[i] == 0){
                ans[i] = mul2;
            }
            if(temp> 1 && nums[i] == 0){
                ans[i] = 0;
            }
        }

        return ans;
    }
}