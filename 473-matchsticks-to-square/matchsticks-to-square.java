class Solution {
    private int target;
    private Boolean [] memo;
    private int [] sticks;
    public boolean makesquare(int[] matchsticks) {
        int n = matchsticks.length;
        if(n < 4) return false;
        int sum = 0;
        for(int matchstick : matchsticks){
            sum += matchstick;
        }
        if(sum % 4 != 0) return false;

        target = sum / 4;
        sticks = matchsticks.clone();

        Arrays.sort(sticks);
        reverse(sticks);
        if(sticks[0] > target){
            return false;
        }
        memo = new Boolean[1 << n];
        return backtrack(0,0,0);

    }
    private boolean backtrack(int mask, int currentSide, int completedSides){
        if(completedSides == 3) return true;
    
        if(memo[mask] != null && currentSide == 0) return memo[mask];

        int n = sticks.length;
        for(int i = 0; i<n; i++){
            if((mask & (1 << i)) != 0) continue;

            if(currentSide + sticks[i] > target) continue;

            if(i > 0 && sticks[i] == sticks[i-1] && (mask & (1 << (i-1))) == 0) continue;

            int newMask = mask | (1 << i);
            int newSide = currentSide + sticks[i];
            boolean result;

            if(newSide == target){
                result = backtrack(newMask, 0, completedSides + 1);
            }else{
                result = backtrack(newMask, newSide, completedSides);
            }

            if(result){
                if(currentSide == 0) memo[mask] = true;
                return true;
            }
            if(currentSide == 0) break;

        }
        if(currentSide == 0) memo[mask] = false;
        return false;
    }
    private void reverse(int [] array){
        int left = 0;
        int right = array.length - 1;
        while(left < right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
