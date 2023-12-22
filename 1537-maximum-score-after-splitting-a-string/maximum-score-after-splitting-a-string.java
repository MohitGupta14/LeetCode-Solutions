class Solution {
    public int maxScore(String s) {
        int zerosLeft = 0;  // Count of zeros in the left substring
        int onesRight = 0;  // Count of ones in the right substring
        int maxScore = 0;
        int totalOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                totalOnes++;
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zerosLeft++;
            } else {
                onesRight++;
            }

            int currentScore = zerosLeft + (totalOnes - onesRight);
            maxScore = Math.max(maxScore, currentScore);
        }

        return maxScore;
    }
}
