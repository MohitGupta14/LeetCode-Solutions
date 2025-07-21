class Solution {
    public String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();
        int repeatCount = 1;

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                repeatCount++;
            } else {
                repeatCount = 1;
            }

            if (repeatCount < 3) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}
