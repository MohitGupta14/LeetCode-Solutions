import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);

        List<int[]> ans = new ArrayList<>();
        int i = 0;

        while (i < nums.length - 2) {
            int num1 = nums[i];
            int num2 = nums[i + 1];
            int num3 = nums[i + 2];

      if (Math.abs(num1 - num2) <= k && Math.abs(num1 - num3) <= k && Math.abs(num2 - num3) <= k) {
                ans.add(new int[]{num1, num2, num3});
                i += 3;
            } else {
                i++;
            }
        }

        if (ans.size() * 3 != nums.length) {
            return new int[0][0];
        }

        return ans.toArray(new int[0][0]);
    }
}
