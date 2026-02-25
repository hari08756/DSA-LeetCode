class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] boxed = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) boxed[i] = arr[i];
        Arrays.sort(boxed, (a, b) -> {
            int ca = Integer.bitCount(a);
            int cb = Integer.bitCount(b);
            if (ca == cb) return a - b;
            return ca - cb;
        });
        for (int i = 0; i < arr.length; i++) arr[i] = boxed[i];
        return arr;
    }
}
