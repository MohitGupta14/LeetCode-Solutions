class Solution {
    public boolean isPowerOfFour(int n) {
        float elem = 1;
        for (int i = 0; i < 50; i++) {
            elem = (float) Math.pow(4, i);  
            if (elem == n) {
                return true;
            }
            if (elem > n) {
                return false;
            }
        }
        return false;
    }
}
