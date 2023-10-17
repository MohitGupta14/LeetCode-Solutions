class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer>n = new HashSet<>();
        for(int i = 0 ;i< nums.length ;i++){
            n.add(nums[i]);
        }

        if(n.size() == nums.length){
            return false;
        }
       
        return true;
    }
}