class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {

        int ans = -1;
        int i = 0;
        int j = i + 1;

        int temp[] = new int[26]; 

        for (int k = 0; k < s.length(); k++) {
            temp[s.charAt(k) - 'a']++; 
        }

        while (i < s.length() - 1) {

            if (temp[s.charAt(i) - 'a'] > 1) { 

                if (s.charAt(i) == s.charAt(j)) {
                    ans = Math.max(ans, j - i - 1);
                }

                if (j == s.length() - 1) {
                    i++;
                    j = i + 1;
                    continue;
                }

                j++;
            } else {
                i++;
            }
        }

        return ans;
    }
}
