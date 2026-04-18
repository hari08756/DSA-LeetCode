class Solution {
    public int mirrorDistance(int n) {
        int m = 0;
        int k = n;
        while(n>0){
            m = m*10 + n%10;
            n /= 10;
        }
        return Math.abs(k-m);
    }
}