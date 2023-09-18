class Solution {

    List<List<Integer>> Ans =  new ArrayList<>();
    
    public void freq(int[] cand , int target , List<Integer>ans , int start){
        
      if(target == 0){
          Ans.add(new ArrayList<>(ans));
          return;
       }

       for(int i = start ; i< cand.length ; i++ ){
          if(target - cand[i]< 0){
             continue;
          }
          ans.add(cand[i]);
          freq(cand,target - cand[i],ans,i);
          ans.remove(ans.size()-1);
        }

    }
    public List<List<Integer>> combinationSum(int[] cand, int target) {
        List <Integer> ans =  new ArrayList<>();
        freq(cand,target,ans,0);
        return Ans;

    }
}