class Solution {
    public int binary(int temp){
        int binary = 0;
        while (temp > 0) {
            if(temp % 2 == 1) binary++;
            temp /= 2;
        }
        return binary;
    }
    public int[] countBits(int n) {
        int [] dp = new int[n + 1];
        if(n == 0) return dp;
        for(int i = 1; i<=n; i++){
            dp[i] = binary(i);
        }
        return dp;
    }
}