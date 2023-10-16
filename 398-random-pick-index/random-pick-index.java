import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Solution {
    private int[] nums;
    private HashMap<Integer, List<Integer>> map;
    private Random random;

    public Solution(int[] temp) {
        nums = temp;
        map = new HashMap<>();
        random = new Random();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.computeIfAbsent(num, k -> new ArrayList<>()).add(i);
        }
    }

    public int pick(int target) {
        if (map.containsKey(target)) {
            List<Integer> indices = map.get(target);
            int randomIndex = random.nextInt(indices.size());
            return indices.get(randomIndex);
        } else {
            return -1; 
        }
    }
}
