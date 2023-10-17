class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int ans = 0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int streak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    streak++;
                }

                ans = Math.max(ans, streak);
            }
        }

        return ans;
    }
}
