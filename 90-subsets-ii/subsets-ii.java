class Solution {
   

    public void backtrack(int[] nums , List<Integer> ans , int start ,List<List<Integer>> Ans){
        
       
        Ans.add(new ArrayList<>(ans));
        
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            ans.add(nums[i]);
            backtrack(nums, ans, i + 1,Ans);
            ans.remove(ans.size() - 1);
        } 
         
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans =  new ArrayList<>();
        List<List<Integer>> Ans= new ArrayList<>();
        backtrack(nums,ans,0,Ans);
        return Ans;
    }
}