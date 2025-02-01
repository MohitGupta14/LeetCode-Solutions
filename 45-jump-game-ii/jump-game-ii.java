class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1) return 0; // No jumps needed if already at last index

        int jumps = 0, farthest = 0, end = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]); // Find the farthest position we can reach

            if (i == end) { // If we reach the end of our current jump
                jumps++; // Make the jump
                end = farthest; // Set the new boundary

                if (end >= nums.length - 1) break; // Stop if we can already reach the last index
            }
        }
        
        return jumps;
    }
}
