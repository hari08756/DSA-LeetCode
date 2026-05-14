class Solution {
    public void fillSeparateDigits(int num , ArrayList<Integer> sep){
        ArrayList<Integer> temp = new ArrayList<>();
        while(num > 0){
            temp.add(num % 10);
            num /= 10;
        }
        for(int i = temp.size() - 1; i >= 0; i--){
            sep.add(temp.get(i));
        }
    }
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> sep = new ArrayList<>();
        for(int num : nums){
            fillSeparateDigits(num, sep);
        }
        int [] ans = new int[sep.size()];
        int k = 0;
        for(int s : sep){
            ans[k++] = s; 
        }
        return ans;
    }
}