class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        
        int ans[] = new int[queries.length];
        for(int i = 0 ; i < queries.length ; i++){
            int temp = 0;

            for(int j = queries[i][0] ; j <= queries[i][1]; j++){
                temp = temp ^ arr[j];
            }

            ans[i] = temp;
        }

        return ans;
    }
}