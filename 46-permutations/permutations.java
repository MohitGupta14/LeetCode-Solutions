class Solution {

     List<List<Integer>> Ans =  new ArrayList<>();
    
    public void permutation(int[] nums,List<Integer> ans){

        if( ans.size() == nums.length ){
            Ans.add(new ArrayList<>(ans));
            return;
        }
        for(int i = 0 ; i< nums.length ; i++){
            if(ans.contains(nums[i])){
             continue;
            }
            ans.add(nums[i]);
            permutation( nums , ans );
            ans.remove(ans.size()-1);
        }
        

    }
    
    public List<List<Integer>> permute(int[] nums) {
        
       List<Integer> ans = new ArrayList<>();
        permutation(nums, ans);

        return Ans;

    }


}