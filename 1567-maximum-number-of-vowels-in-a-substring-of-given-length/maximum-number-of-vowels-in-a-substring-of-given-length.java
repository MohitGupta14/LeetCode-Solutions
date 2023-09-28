class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int maxCount = 0;
        int n = s.length();

        for (int r = 0; r < n; r++) {
            char currChar = s.charAt(r);

            if (check(currChar)) {
                count++;
            }

            if (r >= k) {
                char leftChar = s.charAt(r - k);
                if (check(leftChar)) {
                    count--;
                }
            }

            maxCount = Math.max(count, maxCount);
        }

        return maxCount;
    }

    public boolean check(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
