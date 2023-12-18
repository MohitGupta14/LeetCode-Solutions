import java.util.Arrays;

class Solution {
    public long minimumCost(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int median1 = nums[n / 2];
        int median2 = nums[n / 2]; 

        long cost1 = 0;
        long cost2 = 0;

        while (!isPalindrome(median1)) {
            median1--;
        }

        while (!isPalindrome(median2)) {
            median2++;
        }
        
        System.out.print(median1 + " ");
        System.out.print(median2);


        for (int i = 0; i < nums.length; i++) {
            cost1 = cost1 + Math.abs((median1 - nums[i]));
        }

        for (int i = 0; i < nums.length; i++) {
            cost2 = cost2 + Math.abs((median2 - nums[i])); 
        }

        return Math.min(cost1, cost2);
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }



}
