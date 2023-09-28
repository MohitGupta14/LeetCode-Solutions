import java.util.HashMap;
import java.util.Map;

class Solution {
    public int totalFruit(int[] tree) {
        int maxFruits = 0;
        int left = 0;
        Map<Integer, Integer> fruitCounts = new HashMap<>();

        for (int right = 0; right < tree.length; right++) {
            int fruit = tree[right];
            fruitCounts.put(fruit, fruitCounts.getOrDefault(fruit, 0) + 1);

            while (fruitCounts.size() > 2) {
                int leftFruit = tree[left];
                fruitCounts.put(leftFruit, fruitCounts.get(leftFruit) - 1);
                if (fruitCounts.get(leftFruit) == 0) {
                    fruitCounts.remove(leftFruit);
                }
                left++;
            }

           
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }
}
