class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length;
        int m = queries.length;
        int mod = 1000000007;
        for(int i = 0; i<m; i++){
            int l = queries[i][0];
            int r = queries[i][1];
            int k = queries[i][2];
            int mul = queries[i][3];
            if(k == 0) {
                nums[l] = (nums[l] * mul) % mod;
            }else{
                for(int j = l; j<= r; j += k){
                    nums[j] = (int)((1L*nums[j] * mul) % mod);
                }
            }
        }
        int ans = 0;
        for(int i = 0; i<n; i++){
            ans ^= nums[i];
        }
        return ans;
    }
}