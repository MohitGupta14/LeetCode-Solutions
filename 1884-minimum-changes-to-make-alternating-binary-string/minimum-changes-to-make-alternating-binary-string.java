class Solution {
    public int minOperations(String s) {
        int ans1 = 0;
        int ans2 = 0;
        int n = s.length();

        for (int i = 0; i < n; i += 2) {
            if (s.charAt(i) != '0') {
                ans1++;
            }

            if (i+1 < n && s.charAt(i + 1) != '1') {
                ans1++;
            }

            if (s.charAt(i) != '1') {
                ans2++;
            }

            if (i+1 <n && s.charAt(i + 1) != '0') {
                ans2++;
            }
        }

        return ans1 < ans2 ? ans1 :ans2;
    }
}
