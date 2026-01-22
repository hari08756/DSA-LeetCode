class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int maxIceCream = 0;
        for(int i = 0; i<costs.length; i++){
            if(coins <= 0 || coins < costs[i]) break;
            maxIceCream++;
            coins -= costs[i];
        }
        return maxIceCream;
    }
}