class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        Boolean [][] mat = new Boolean[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(matrix[i][j] == 0){
                    mat[i][j] = true;
                }else{
                    mat[i][j] = false;
                }  
            }
        }        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(mat[i][j] == true){
                    for(int k = 0; k<n; k++){
                        matrix[k][j] = 0;
                    }
                    for(int k = 0; k<m; k++){
                        matrix[i][k] = 0;
                    }
                }
            }
        }
    }
}