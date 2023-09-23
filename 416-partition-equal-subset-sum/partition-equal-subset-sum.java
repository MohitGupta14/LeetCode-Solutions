class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) return false;
        int target = sum / 2;

        Set<Integer> dp = new HashSet<>();
        dp.add(0);
     
         for (int num : nums) {
            Set<Integer> newSums = new HashSet<>(dp);
            for (int val : dp) {
                int newSum = val + num;
                if (newSum == target) {
                    return true;
                }
                newSums.add(newSum);
            }
            dp = newSums;
        }

 

        return false;
    }
}