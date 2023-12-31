class Solution {
    public int maxArea(int[] height) {
        int ans = -9999999;
        int i = 0 ;
        int j = height.length-1;
        while(i<j){ 
            int maxPossible = height[i]*(height.length-i-1);
            if(maxPossible <= ans){
                i++;
                continue;
            }

            maxPossible = height[j]*(j);
            if(maxPossible <= ans){
                j--;
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