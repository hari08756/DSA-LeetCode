class Solution {
    public void calPoint(String [] operations, int i, Stack<Integer> st){
        if(operations.length == i) return;
        String s = operations[i];
        if(s.equals("D")){
            st.push(st.peek()*2);
        }else if(s.equals("C")){
            st.pop();
        }else if(s.equals("+")){
            int se = st.pop();
            int f = st.peek();
            st.push(se);
            st.push(f+se);
        }else{
            st.push(Integer.parseInt(s));
        }
        calPoint(operations, i+1, st);
    }
    public int calPoints(String[] operations) {
        
        int sum = 0;
        Stack<Integer> st = new Stack<>();
        calPoint(operations, 0, st);
        while(!st.empty()) sum += st.pop();
        return sum;
    }
}