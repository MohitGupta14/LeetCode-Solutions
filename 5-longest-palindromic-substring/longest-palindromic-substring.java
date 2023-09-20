class Solution {
    List<String> dp = new ArrayList<>();
    boolean count = false;

    public void checkPal(String s) {
        int beg = 0;
        int end = s.length() - 1;

        while (beg < end) {
            if (s.charAt(beg) == s.charAt(end)) {
                beg++;
                end--;
                count = true;
            } else {
                count = false;
                break;
            }
        }

        if (count) {
            dp.add(s);
        }
    }

    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= i; j--) {
                checkPal(s.substring(i, j + 1));
                if (count) {
                    break;
                }
            }
        }

        if (dp.isEmpty()) {
            return Character.toString(s.charAt(0)); // Handle the case where there are no palindromes found
        }

        String maxLengthString = dp.get(0);

        for (String str : dp) {
            if (str.length() > maxLengthString.length()) {
                maxLengthString = str;
            }
        }

        return maxLengthString;
    }
}
