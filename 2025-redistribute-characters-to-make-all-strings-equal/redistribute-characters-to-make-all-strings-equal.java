class Solution {
    public boolean makeEqual(String[] words) {
        int[] count = new int[26];

        for (String word : words) {
            for (char ch : word.toCharArray()) {
                count[ch - 'a']++;
            }
        }

        for (int c : count) {
            if (c % words.length != 0) {
                return false;
            }
        }

        return true;
    }
}
