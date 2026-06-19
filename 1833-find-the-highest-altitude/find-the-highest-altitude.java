class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int [] altitudes = new int[n+1];
        altitudes[0] = 0;
        int max = 0;
        for(int i = 0; i<n; i++){
            altitudes[i+1] = altitudes[i] + gain[i];
            max = Math.max(max, altitudes[i+1]);
        }
        return max;
    }
}