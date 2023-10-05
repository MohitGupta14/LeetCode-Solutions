class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int counter = nums.length/3;
        Arrays.sort(nums);
        int count = 0;
        List<Integer>ans = new ArrayList<>();
        if(nums.length <= 2){
            for(int i = 0 ; i< nums.length ;i++){
                if(!ans.contains(nums[i])){
                     ans.add(nums[i]);
                }
            }
            return ans;
        }
        for(int i = 1 ; i< nums.length ; i++ ){
            if(nums[i-1] == nums[i]){
                count++;
                
            }else{
                count = 0;
            }
            if(count >= counter){
               if(!ans.contains(nums[i-1])){
                     ans.add(nums[i-1]);
                }
                count = 0;
            }
            
        }

        return ans;
    }
}