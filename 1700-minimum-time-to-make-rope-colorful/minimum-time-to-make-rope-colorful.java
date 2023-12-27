import java.util.PriorityQueue;

class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ans = 0;
        int i = 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        while (i < colors.length()) {
            pq.add(neededTime[i - 1]);

            while (i < colors.length() && colors.charAt(i - 1) == colors.charAt(i)) {
                pq.add(neededTime[i]);
                i++;
            }

            if (!pq.isEmpty()) {
                while (pq.size() > 1) {
                    ans += pq.poll();
                }
                pq.poll();
            }

            i++;
        }

        return ans;
    }
}
