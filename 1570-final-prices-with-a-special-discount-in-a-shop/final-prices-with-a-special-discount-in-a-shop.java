class Solution {
    public int[] finalPrices(int[] prices) {
        int [] fPrices = prices;
        int n = prices.length;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(prices[i] >= prices[j]){
                    fPrices[i] -= prices[j];
                    break;
                }
            }
        }
        return fPrices;
    }
}