import java.util.HashMap;
import java.util.Map;

class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> count = new HashMap<>();
        int left = 0;
        int total = 0;
        int res = 0;

        for (int fruit : fruits) {
            count.put(fruit, count.getOrDefault(fruit, 0) + 1);
            total++;

            while (count.size() > 2) {
                int f = fruits[left];
                count.put(f, count.get(f) - 1);
                total--;
                left++;
                if (count.get(f) == 0) {
                    count.remove(f);
                }
            }

            res = Math.max(res, total);
        }

        return res;
    }
}
