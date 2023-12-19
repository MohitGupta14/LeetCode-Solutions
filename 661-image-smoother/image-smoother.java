class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                int count = 0;

                for (int ni = i - 1; ni <= i + 1; ni++) {
                    for (int nj = j - 1; nj <= j + 1; nj++) {
                        if (isValidIndex(ni, nj, m, n)) {
                            sum += img[ni][nj];
                            count++;
                        }
                    }
                }

                ans[i][j] = (int) Math.floor((double) sum / count);
            }
        }

        return ans;
    }

    private boolean isValidIndex(int i, int j, int m, int n) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }
}
