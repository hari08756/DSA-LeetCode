class Solution {
    public String frequencySort(String s) {
        int n = s.length();

        int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        @SuppressWarnings("unchecked")
        List<Character>[] buckets = new List[n + 1];
        for (int ch = 0; ch < 128; ch++) {
            int f = freq[ch];
            if (f > 0) {
                if (buckets[f] == null) {
                    buckets[f] = new ArrayList<>();
                }
                buckets[f].add((char) ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int f = n; f >= 1; f--) {
            if (buckets[f] == null) continue;
            for (char c : buckets[f]) {
                for (int i = 0; i < f; i++) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }
}