class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : text.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int a = 0, b = 0, l = 0, n = 0, o = 0;
        if(map.containsKey('a')) a = map.get('a');
        if(map.containsKey('b')) b = map.get('b');
        if(map.containsKey('l')) l = map.get('l') / 2;
        if(map.containsKey('n')) n = map.get('n');
        if(map.containsKey('o')) o = map.get('o') / 2;

        return Math.min(b,Math.min(Math.min(a,l), Math.min(n,o)));
    }
}