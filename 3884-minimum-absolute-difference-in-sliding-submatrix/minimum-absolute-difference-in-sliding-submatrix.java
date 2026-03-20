class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int resRows = m - k + 1;
        int resCols = n - k + 1;
        int[][] ans = new int[resRows][resCols];

        // For every possible k x k submatrix
        for (int i = 0; i <= m - k; i++) {
            for (int j = 0; j <= n - k; j++) {

                // Collect all values in this k x k submatrix
                int size = k * k;
                int[] vals = new int[size];
                int idx = 0;
                for (int x = i; x < i + k; x++) {
                    for (int y = j; y < j + k; y++) {
                        vals[idx++] = grid[x][y];
                    }
                }

                // Sort values
                Arrays.sort(vals);

                // Find minimum absolute difference between any two distinct values
                int best = Integer.MAX_VALUE;
                for (int t = 1; t < size; t++) {
                    if (vals[t] != vals[t - 1]) {
                        int diff = vals[t] - vals[t - 1];  // non-negative since sorted
                        if (diff < best) {
                            best = diff;
                        }
                    }
                }

                // If all elements are equal, best stays Integer.MAX_VALUE -> answer is 0
                if (best == Integer.MAX_VALUE) {
                    ans[i][j] = 0;
                } else {
                    ans[i][j] = best;
                }
            }
        }

        return ans;
    }
}
