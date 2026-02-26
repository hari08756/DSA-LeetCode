class Solution {
    public int numSteps(String s) {
        int steps = 0;
        int carry = 0;
        int n = s.length();
        
        for (int i = n - 1; i > 0; i--) {
            int bit = s.charAt(i) - '0';
            if (bit + carry == 0) {
                steps += 1;
            } else if (bit + carry == 1) {
                steps += 2;
                carry = 1;
            } else { // bit + carry == 2
                steps += 1;
            }
        }
        
        if (carry == 1) {
            steps += 1;
        }
        
        return steps;
    }
}
