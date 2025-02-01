class Solution {
    public int maxArea(int[] height) {
        int maxVol = 0 ;
         
        int ptr1 = 0;
        int ptr2 = height.length-1;

        while(ptr1<height.length-1){
            if(height[ptr1]< height[ptr2]){
                maxVol = Math.max(maxVol,height[ptr1]*(ptr2-ptr1));
                ptr1++;
                ptr2 = height.length-1;
            }else{
               maxVol = Math.max(maxVol,height[ptr2]*(ptr2-ptr1));
               ptr2--;
            }

            if(ptr2<=ptr1){
                ptr1++;
                ptr2 = height.length-1;
            }
        }

        return maxVol;
    }
}