import java.util.Random;

class Solution {
    private int[] nums;

    public Solution(int[] temp) {
        nums = temp;
    }

    public int pick(int target) {
        Random rand = new Random();
        int result = -1;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
                if (rand.nextInt(count) == 0) {
                    result = i;
                }
            }
        }

        return result;
    }
}
