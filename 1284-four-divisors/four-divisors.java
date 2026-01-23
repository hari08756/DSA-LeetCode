class Solution {
    public int isDivisor(int num){
        int cn = 0;
        int sum = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                cn ++;
                sum += i;
            }
            if(cn>4) return 0;
        }
        return cn == 4 ? sum : 0;
    }
    public int sumFourDivisors(int[] nums) {
        int maxDiv = 0;
        for(int num : nums){
            maxDiv += isDivisor(num);
        }
        return maxDiv;
    }
}