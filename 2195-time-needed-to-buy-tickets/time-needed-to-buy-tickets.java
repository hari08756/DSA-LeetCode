class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int minTime = tickets[k];
        for(int i = 0; i<tickets.length; i++){
            if(i<k) minTime += Math.min(tickets[i], tickets[k]);
            if(i>k) minTime += Math.min(tickets[i], tickets[k] - 1);
        }
        return minTime;
    }
}