class Solution {
    public boolean makeEqual(String[] words) {
        int alpha[] = new int[26];

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                alpha[words[i].charAt(j) - 'a']++;
            }
        }

        for (int count : alpha) {
            if (count > 0 && count % words.length != 0) {
                return false;
            }
        }

        return true;
    }
}
