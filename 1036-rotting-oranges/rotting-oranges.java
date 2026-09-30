class Solution {
    public int dfs(int [][] grid, int i, int j){
        if(i < 0 || i >= grid.length ||
            j < 0 || j >= grid[0].length ||
            grid[i][j] == 0 || grid[i][j] == 2
        ) return 0;
        int sum = 0;
        Queue<Integer> q = new LinkedList<>();
        if(grid[i][j] == 1){
            if(j + 1 > grid[0].length && grid[i][j+1] == 1){
                q.add(j+1);
            }
            if(i + 1 > grid.length && grid[i+1][j] == 1){
                q.add(i+1);
            }
        }
        grid[i][j] = 2;
        while(!q.isEmpty()){
            sum = 1 + dfs(grid, q.poll(), j) + dfs(grid, i, q.poll());
        }
        return sum;
    }
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