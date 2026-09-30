class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int fresh = 0;

        Queue<int[]> q = new LinkedList<>();
        int [][] directions = {
            {0,-1},
            {0,1},
            {1,0},
            {-1,0}
        };

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        int minutes = 0;
        while(!q.isEmpty() && fresh > 0){
            int size = q.size();
            while(size-- > 0){
                int [] curr = q.poll();
                int r = curr[0];
                int c = curr[1];
                for(int [] dir : directions){
                    int nr = r + dir[0];
                    int nc = c + dir[1];
                    if(nr >= 0 && nr < n &&
                        nc >= 0 && nc < m &&
                        grid[nr][nc] == 1
                    ){
                        fresh--;
                        grid[nr][nc] = 2;
                        q.offer(new int [] {nr, nc});
                    }
                }
            }
            minutes++;

        }
        
        return fresh == 0 ? minutes : -1;
    }
}