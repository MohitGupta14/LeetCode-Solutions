class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

    if(nums == null || nums.length < 2 || k == 0)
            return false;
        
        Set<Integer> set = new HashSet<>();
         int left = 0;
        for(int i = 0 ; i<nums.length ; i++){

            if(set.size() > k){
               set.remove(nums[left]);
               left++;
            }

            if(set.contains(nums[i])){
                return true;
            }

            set.add(nums[i]);
        }

        return false;
        
    }
}