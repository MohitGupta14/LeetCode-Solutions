public class Solution {
    public boolean handler(char a, char b, String order) {
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < order.length(); i++) {
            if (order.charAt(i) == a) {
                index1 = i;
            }

            if (order.charAt(i) == b) {
                index2 = i;
            }
        }

        return index1 <= index2;
    }

    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 1; i < words.length; i++) {
            int j = 0;
            while (j < words[i - 1].length() && j < words[i].length()) {
                if (words[i - 1].charAt(j) != words[i].charAt(j)) {
                    if (!handler(words[i - 1].charAt(j), words[i].charAt(j), order)) {
                        return false;
                    }
                    break; 
                }
                j++;
            }
            if (j == words[i].length() && j < words[i - 1].length()) {
                return false;
            }
        }
        return true;
    }
}
