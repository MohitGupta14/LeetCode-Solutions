class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                int count = 0;

                for (int ni =  - 1; ni <=   1; ni++) {
                    for (int nj =  - 1; nj <=   1; nj++) {
                        int nx = ni + i;
                        int ny = nj + j;
                        if(nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
                            sum += img[nx][ny];
                            count++;
                    }
                }

                ans[i][j] = (int) Math.floor((double) sum / count);
            }
        }

        return ans;
    }

    
}
