class Solution {
    public int largestRectangleArea(int[] heights) {       
        int n = heights.length;
        int[] leftSmaller = new int[n];
        int[] rightSmaller = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        // Find nearest smaller element on the left
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                leftSmaller[i] = -1;
            } else {
                leftSmaller[i] = stack.peek();
            }
            stack.push(i);
        }
        
        stack.clear();
        
        // Find nearest smaller element on the right
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                rightSmaller[i] = n;
            } else {
                rightSmaller[i] = stack.peek();
            }
            stack.push(i);
        }
        
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = rightSmaller[i] - leftSmaller[i] - 1;
            maxArea = Math.max(maxArea, width * heights[i]);
        }
        
        return maxArea;
        
    }
}