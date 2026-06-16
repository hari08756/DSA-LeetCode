class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            int k = sb.length() - 1;
            if(ch == '*'){
                if(k < 0) continue;
                sb.deleteCharAt(k);
            }else if(ch == '#'){
                if(k < 0) continue;
                sb.append(sb);
            }else if(ch == '%'){
                sb.reverse();
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}