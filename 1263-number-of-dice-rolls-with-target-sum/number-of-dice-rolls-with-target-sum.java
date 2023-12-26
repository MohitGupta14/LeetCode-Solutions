class Solution {
    private static final int MOD = 1000000007;

    public int numRollsToTarget(int n, int k, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            int[] newDp = new int[target + 1];
            for (int j = 1; j <= target; j++) {
                for (int d = 1; d <= k; d++) {
                    if (j - d >= 0) {
                        newDp[j] = (newDp[j] + dp[j - d]) % MOD;
                    }
                }
            }
            dp = newDp;
        }

        return dp[target];
    }
}
