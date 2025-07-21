class Solution {
    public String makeFancyString(String s) {
        if (s.length() < 3) return s;

        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0));
        result.append(s.charAt(1));

        for (int i = 2; i < s.length(); i++) {
            char c = s.charAt(i);
            if (result.charAt(result.length() - 1) == c && result.charAt(result.length() - 2) == c) {
                continue; 
            }
            result.append(c);
        }

        return result.toString();
    }
}
