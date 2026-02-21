class Solution {
    private static final Set<Integer> primes = Set.of(2,3,5,7,11,13,17,19);
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for(int i = left; i<=right; i++){
            int bits = Integer.bitCount(i);
            if(primes.contains(bits)){
                ans++;
            }
        }
        return ans;
    }
}