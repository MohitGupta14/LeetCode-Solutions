class Solution {

    List <Integer> ans =  new ArrayList<>();
    
    public void subset(int[] num , List<List<Integer>> Ans , int i ){
        
        if(i == num.length){
            Ans.add(new ArrayList<>(ans));
            return;
        }
        //yes
        ans.add(num[i]);
        subset(num , Ans,i+1);

        ans.remove(ans.size()-1);
        subset(num, Ans,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> Ans = new ArrayList<>();
        subset(nums,Ans,0);

        return Ans;

    }
}