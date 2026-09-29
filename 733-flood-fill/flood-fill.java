class Solution {
    public void dfs(int[][] image, int sr, int sc, int currColor, int color){
        if(sr < 0 || sr >= image.length ||
            sc < 0 || sc >= image[0].length ||
            image[sr][sc] != currColor
        ) return;
        image[sr][sc] = color;
        dfs(image, sr, sc-1, currColor, color);
        dfs(image, sr, sc+1, currColor, color);
        dfs(image, sr-1, sc, currColor, color);
        dfs(image, sr+1, sc, currColor, color);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        
        if(image[sr][sc] == color) return image;

        dfs(image, sr, sc, image[sr][sc], color);
        return image;

    }
}