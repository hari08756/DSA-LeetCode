class Solution {
    public List<String> stringMatching(String[] words) {
        int n = words.length;
        List<String> ans = new ArrayList<>();
        for(String a : words){
            for(String b : words){
                if(a != b && b.contains(a)){
                    ans.add(a);
                    break;
                }
            }
        }
        return ans;
    }
}