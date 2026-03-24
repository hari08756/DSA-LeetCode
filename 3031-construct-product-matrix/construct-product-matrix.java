class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        final int MOD = 12345;
        int n = grid.length, m = grid[0].length;
        int total = n * m;

        // Flatten and take modulo
        int[] a = new int[total];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[idx++] = grid[i][j] % MOD;
            }
        }

        // prefix[i] = product of a[0..i-1] modulo MOD
        int[] prefix = new int[total + 1];
        prefix[0] = 1;
        for (int i = 0; i < total; i++) {
            long prod = (long) prefix[i] * a[i];
            prefix[i + 1] = (int) (prod % MOD);
        }

        // suffix = product of a[i+1..end] while going backwards
        int[] ansFlat = new int[total];
        long suffix = 1;
        for (int i = total - 1; i >= 0; i--) {
            long val = (long) prefix[i] * suffix % MOD;
            ansFlat[i] = (int) val;
            suffix = suffix * a[i] % MOD;
        }

        // Un-flatten to matrix
        int[][] ans = new int[n][m];
        idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = ansFlat[idx++];
            }
        }
        return ans;
    }
}
