class Solution {
    public int maxArea(int[] height) {
        int ans = -9999999;
        int i = 0 ;
        int j = height.length-1;
        while(i<j){ 
            int maxPossible = height[i]*height.length;
            if(maxPossible <= ans){
                i++;
                continue;
            }
           ans = Math.max(Math.min(height[i],height[j])*(j-i),ans);
           if(height[i]>height[j]){
               j--;
           }else{
               i++;
           }
        }

        return ans;
        
    }
}