class Solution {
    public String makeFancyString(String s) {
        if (s.length() < 3) return s;

        StringBuilder ans = new StringBuilder();
        char prev = s.charAt(0);
        int freq = 1;
        ans.append(prev);

        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == prev) {
                freq++;
            } else {
                prev = current;
                freq = 1;
            }

            if (freq < 3) {
                ans.append(current);
            }
        }

        return ans.toString();
    }
}
