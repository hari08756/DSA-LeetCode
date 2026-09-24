class Solution {
    private boolean canFinish(int[] piles, int h, int speed){
        long neededHours = 0;
        for(int pile : piles){
            neededHours += (pile + speed - 1) / speed;
            if(neededHours > h) return false;
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 1;
        for(int pile : piles){
            high = Math.max(high, pile);
        }
        while(low < high){
            int mid = low + (high - low)/2;
            if(canFinish(piles, h, mid)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}