import java.util.PriorityQueue;

class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ans = 0;
        int i = 1;

        while (i < colors.length()) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            int k = 0;
            while (i < colors.length() && colors.charAt(i - 1) == colors.charAt(i)) {
                pq.add(neededTime[i-1]);
                k = 1;
                i++;
            }
            if(i-1 < colors.length() && k == 1){
                pq.add(neededTime[i-1]);

            }

            if (!pq.isEmpty()) {
                while (pq.size() != 1) {
                    System.out.print(pq.peek());
                    ans += pq.poll();
                }
                pq.poll();
            }

            i++;
        }

        return ans;
    }
}
