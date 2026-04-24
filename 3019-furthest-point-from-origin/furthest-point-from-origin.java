class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countL = 0, countR = 0, count = 0;
        for(char ch : moves.toCharArray()){
            if(ch == 'L'){
                countL++;
            }else if(ch == 'R'){
                countR++;
            }else{
                count++;
            }
        }
        return count + Math.abs(countL - countR);
    }
}