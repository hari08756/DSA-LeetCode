class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int [][] paths = new int [m][n];
        if(obstacleGrid[0][0] == 1) return 0;
        for(int i = 1; i<m; i++){
            obstacleGrid[i][0] += obstacleGrid[i-1][0];
        }
        for(int i = 1; i<n; i++){
            obstacleGrid[0][i] += obstacleGrid[0][i-1];
        }
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(i == 0 || j == 0){
                    paths[i][j] = 1;
                    if(obstacleGrid[i][j] >= 1) paths[i][j] = 0;
                }else{
                    paths[i][j] = paths[i-1][j] + paths[i][j-1];
                    if(obstacleGrid[i][j] >= 1) paths[i][j] = 0;
                }
                
            }
        }
        return paths[m-1][n-1];
    }
}