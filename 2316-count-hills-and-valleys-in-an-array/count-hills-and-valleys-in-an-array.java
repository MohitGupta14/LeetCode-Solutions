class Solution {
    public int countHillValley(int[] nums) {

        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                list.add(nums[i]);
            }
        }

        int ans = 0;
        for (int i = 1; i < list.size() - 1; i++) {
            int prev = list.get(i - 1);
            int curr = list.get(i);
            int next = list.get(i + 1);

            if (curr > prev && curr > next) ans++;  // Hill
            if (curr < prev && curr < next) ans++;  // Valley
        }

        return ans;
    }
}
