class Solution {
    public int maxArea(int[] height) {
        int maxVol = 0;
        int ptr1 = 0, ptr2 = height.length - 1;

        while (ptr1 < ptr2) {
            int minHeight = Math.min(height[ptr1], height[ptr2]);
            maxVol = Math.max(maxVol, minHeight * (ptr2 - ptr1));

            if (height[ptr1] < height[ptr2]) {
                ptr1++;
            } else {
                ptr2--;
            }
        }

        return maxVol;
    }
}
