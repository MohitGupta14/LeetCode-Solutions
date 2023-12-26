class Solution {
    private static final int MOD = 1000000007;

    public int numRollsToTarget(int n, int k, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            int[] newDp = new int[target + 1];
            int sum = 0;

            for (int j = 1; j <= target; j++) {
                sum = (sum + dp[j - 1]) % MOD;
                if (j >= k + 1) {
                    sum = (sum - dp[j - k - 1] + MOD) % MOD;
                }
                newDp[j] = sum;
            }

            dp = newDp;
        }

        return dp[target];
    }
}
