class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int maxCost = costs[0];
        for(int c : costs){
            maxCost = Math.max(maxCost, c);
        }
        int [] nCosts = new int [maxCost + 1];
        for(int c : costs){
            nCosts[c] ++;
        }
        int maxIceCream = 0;
        for(int i = 1; i <= maxCost && coins >0; i++){
            while(nCosts[i]>0 && coins >= i){
                maxIceCream++;
                coins -= i;
                nCosts[i]--;
            }
        }
        return maxIceCream;
    }
}