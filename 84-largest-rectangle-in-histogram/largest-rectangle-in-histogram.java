class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int [] preSmall = new int[n];
        int [] nextSmall = new int[n];
        Stack<Integer> st = new Stack<>();
        preSmall[0] = -1;
        nextSmall[n-1] = n;
        st.push(0);
        for(int i = 1; i<n; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                preSmall[i] = -1;
            }else{
                preSmall[i] = st.peek();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            st.pop();
        }
        st.push(n-1);
        for(int i = n-2; i>=0; i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nextSmall[i] = n;
            }else{
                nextSmall[i] = st.peek();
            }
            st.push(i);
        }
        int maxArea = 0;
        for(int i = 0; i<n; i++){
            maxArea = Math.max(maxArea, heights[i] * (nextSmall[i] - preSmall[i] - 1));
        }
        return maxArea;
    }
}