class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
      
      List<List<Integer>> ans = new ArrayList<>();
      Arrays.sort(nums);
      for(int i = 0 ; i<nums.length ;i++){
        int left =  i+1;
        int right = nums.length- 1;

        if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }

        while(left < right ){
          int sum = nums[i] + nums[left] +nums[right];
            if(nums[i] + nums[left] +nums[right] == 0){
              ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
            
            
              while(left < right && nums[left] == nums[left+1]){
                left++;
              }

              while(left < right && nums[right] == nums[right-1]){
                right--;
              }

            left++;
            right--;
                
          }else if(sum < 0){
            left++;
          }else{
            right--;
          }
        }
      }
   
    return ans;
  }
}