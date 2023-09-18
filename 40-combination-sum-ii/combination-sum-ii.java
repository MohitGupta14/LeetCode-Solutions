class Solution {
    
    public void backtrack(int[] nums, int target , List<Integer> ans , int start ,List<List<Integer>> Ans ){

        if(target == 0 ){
            Ans.add(new ArrayList<>(ans));
            return;
        }

        for(int i = start  ; i < nums.length ; i++){

             if (i > start && nums[i] == nums[i - 1]) {
                continue; 
            }
            
            if( target - nums[i] < 0 ) continue;
            ans.add(nums[i]);

            backtrack(nums, target-nums[i] ,ans,i+1,Ans);
            ans.remove(ans.size() -1);
          
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> Ans =  new ArrayList<>();
        backtrack(candidates, target, ans,0,Ans);

        return Ans;

    }
}