class Solution {
    public int count(String s){
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
    public int numberOfBeams(String[] bank) {
        int n = bank.length;
        int count1prev = count(bank[0]);
        int maxLaser = 0;
        for(int i = 1; i<n; i++){
            int count1curr = count(bank[i]);
            if(count1curr == 0) continue;
            maxLaser += count1prev * count1curr;
            count1prev = count1curr;
        }
        return maxLaser;
    }
}