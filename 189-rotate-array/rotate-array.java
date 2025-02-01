import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k > n

        int[] temp = new int[n];

        // Copy last k elements to the beginning
        System.arraycopy(nums, n - k, temp, 0, k);
        // Copy first n-k elements after that
        System.arraycopy(nums, 0, temp, k, n - k);
        // Copy everything back to nums
        System.arraycopy(temp, 0, nums, 0, n);
    }
}
