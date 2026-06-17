class Solution {
    public int greater(int a, int b){
        if(a <= 99 && b <= 99) return 0;
        int max = 0;
        while(a > 99 && b > 99){ 
            int x = a % 10, y = (a/10) % 10, z = (a/100)%10;
            if((x > y && z > y) || (x<y && z < y)){
                max++;
            }
            a /= 10;
            b /= 10;
        }
        return max;
    }
    public int totalWaviness(int num1, int num2) {
        int maxWaviness = 0;
        num1 = Math.max(num1, 101);
        while(num1 <= num2){
            maxWaviness += greater(num1, num2);
            num1++;
        }
        return maxWaviness;
    }
}