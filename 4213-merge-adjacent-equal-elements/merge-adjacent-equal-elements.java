class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Deque<Long> st = new ArrayDeque<>();
        for(int i = 0; i<nums.length; i++){
            long val = nums[i];
            while(!st.isEmpty() && st.peek() == val){
                st.pop();
                val = 2*val;
            }
            st.push(val);
        }
        ArrayList<Long> num = new ArrayList<>();
        while(!st.isEmpty()){
            num.add(st.pop());
        }
        Collections.reverse(num);
        return num;
    }
}