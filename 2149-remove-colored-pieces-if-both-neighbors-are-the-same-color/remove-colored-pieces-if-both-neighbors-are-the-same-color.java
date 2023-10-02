class Solution {
    public boolean winnerOfGame(String colors) {
        int countA = 0;
        int countB = 0;
        int consecutiveA = 0;
        int consecutiveB = 0;

        for (int i = 0; i < colors.length(); i++) {
            char currentColor = colors.charAt(i);

            if (currentColor == 'A') {
                consecutiveA++;
                consecutiveB = 0; // Reset consecutiveB count
            } else if (currentColor == 'B') {
                consecutiveB++;
                consecutiveA = 0; // Reset consecutiveA count
            } else {
                // If it's not 'A' or 'B', reset both counts
                consecutiveA = 0;
                consecutiveB = 0;
            }

            if (consecutiveA >= 3) {
                countA++;
            }

            if (consecutiveB >= 3) {
                countB++;
            }
        }

        return countA > countB;
    }
}
