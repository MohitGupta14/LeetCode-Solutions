class Solution {
    public int maxArea(int[] height) {
        int ans = -9999999;
        for(int i = 0 ; i< height.length;i++){
            
            int maxPossible = height[i]*height.length;
            if(maxPossible <= ans){
                continue;
            }
            for(int j = i+1 ; j< height.length;j++){
                ans = Math.max(Math.min(height[i],height[j])*(j-i),ans);
            }
        }

        return ans;
        
    }
}