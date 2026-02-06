class Solution {
    public String toHex(int num) {
        if(num == 0) return "0";
        String map = "0123456789abcdef";
        StringBuilder sb = new StringBuilder();
        while(num != 0 && sb.length() < 8){
            int digit = num & 0xf;
            sb.append(map.charAt(digit));
            num >>>= 4;
        }
        return sb.reverse().toString();
    }
}