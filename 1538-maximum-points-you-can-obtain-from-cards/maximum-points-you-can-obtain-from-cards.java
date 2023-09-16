import java.util.PriorityQueue;

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0;
        int windowSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum += cardPoints[i];
            if (i < n - k) {
                windowSum += cardPoints[i];
            }
        }

        int minWindowSum = windowSum;
        for (int i = n - k; i < n; i++) {
            windowSum += cardPoints[i] - cardPoints[i - (n - k)];
            minWindowSum = Math.min(minWindowSum, windowSum);
        }

        return totalSum - minWindowSum;
    }
}
