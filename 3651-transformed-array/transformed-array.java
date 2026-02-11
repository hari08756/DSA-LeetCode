class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int val = nums[i];

            if (val == 0) {
                result[i] = 0;          
            } else {
                int next = i + val;   
                next %= n;              
                if (next < 0) {
                    next += n;          
                }
                result[i] = nums[next];
            }
        }

        return result;
    }
}
