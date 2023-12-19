import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i = i + 3) {
            ArrayList<Integer> temp = new ArrayList<>();
            if (check(nums[i], nums[i + 1], nums[i + 2], k)) {
                temp.add(nums[i]);
                temp.add(nums[i + 1]);
                temp.add(nums[i + 2]);
                ans.add(temp);
            }
        }
        if(ans.size() *3 != nums.length){
            return new int[0][0];
        }
        return toArray(ans);
    }

    public boolean check(int i, int j, int k, int threshold) {
        if (Math.abs(i - j) <= threshold && Math.abs(i - k) <= threshold && Math.abs(j - k) <= threshold) {
            return true;
        }

        return false;
    }

    public int[][] toArray(ArrayList<ArrayList<Integer>> list) {
        int[][] array = new int[list.size()][3];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = list.get(i).get(j);
            }
        }
        return array;
    }
}
