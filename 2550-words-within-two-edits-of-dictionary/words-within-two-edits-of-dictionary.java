class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> equalWords = new ArrayList<>();
        for(String q : queries){
            for(String d : dictionary){
                if(q.length() == d.length()){
                    int diff = 0;
                    for(int i = 0; i<q.length() && diff <= 2; i++){
                        if(q.charAt(i) != d.charAt(i)) diff++;
                    }
                    if(diff <= 2){
                        equalWords.add(q);
                        break;
                    }
                }
            }
        }
        return equalWords;
    }
}