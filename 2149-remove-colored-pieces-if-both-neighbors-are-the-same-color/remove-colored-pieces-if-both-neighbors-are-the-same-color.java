class Solution {
    public boolean winnerOfGame(String colors) {
        StringBuffer s = new StringBuffer(colors);
        int countA = 0;
        int countB = 0;

        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'A' && s.charAt(i - 1) == 'A' && s.charAt(i + 1) == 'A') {
                countA++;
            }
            if (s.charAt(i) == 'B' && s.charAt(i - 1) == 'B' && s.charAt(i + 1) == 'B') {
                countB++;
            }
        }

        return countA > countB;
    }
}
