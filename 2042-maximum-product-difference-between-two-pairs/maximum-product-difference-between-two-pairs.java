class Solution {
    public int maxProductDifference(int[] num) {
        int k = num.length;
        int elem1 = Integer.MAX_VALUE;
        int elem2 = Integer.MIN_VALUE;
        int elem3 = Integer.MAX_VALUE;
        int elem4 = Integer.MIN_VALUE;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < k; i++) {
            elem1 = Math.min(elem1, num[i]);
            elem2 = Math.max(elem2, num[i]);
        }
        for (int i = 0; i < k; i++) {
            if(elem1 == num[i]){
                index1 = i;
            }

            if(elem2 == num[i]){
                index2 = i;
            }
        }

        for (int i = 0; i < k; i++) {
            if (i != index1) {
                elem3 = Math.min(elem3, num[i]);
            }

            if (i != index2) {
                elem4 = Math.max(elem4, num[i]);
            }
        }
        
        return elem2 * elem4 - elem1 * elem3;
    }
}