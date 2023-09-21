import java.util.HashMap;
import java.util.Map.Entry;
class Solution {

    HashMap<Integer,Integer>h1 = new HashMap<>();
    public int[] twoSum(int[] arr, int target) {
      int[] ans = new int[2];
      for(int i =0;i< arr.length;i++){
          int temp = target - arr[i];
          if(h1.containsKey(temp)){
              ans[0] = i;
              ans[1] = h1.get(temp);
              return ans;
           }
           h1.put(arr[i],i);
      }
       return ans;
    }
}