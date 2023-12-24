class Solution {
    public int minOperations(String s) {
        int ans1 = 0;
        int ans2 = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != (i % 2 == 0 ? '0' : '1')) {
                ans1++;
            }

            if (s.charAt(i) != (i % 2 == 0 ? '1' : '0')) {
                ans2++;
            }
        }

        return ans1 < ans2 ? ans1 :ans2;
    }
}
