class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        int ans[] = new int[2];
        for(int i = 0 ; i < nums.length ; i++){
            arr.add(nums[i]);
        }

        for(int i = 0 ; i< nums.length ;i++){
            int elem = target - nums[i];
            if(arr.contains(elem)){
                ans[0] = i;
                ans[1] = arr.indexOf(elem);
                if(ans[0] != ans[1]){
                    return ans;
                }
            }
        }

        return ans;
    }
}