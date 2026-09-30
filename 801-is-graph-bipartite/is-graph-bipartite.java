class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int [] color = new int[n];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<n; i++){
            if(color[i] != 0) continue;
            color[i] = 1;
            q.offer(i);
            while(!q.isEmpty()){
                int node = q.poll();
                for(int neighbor : graph[node]){
                    if(color[neighbor] == 0){
                        color[neighbor] = -color[node];
                        q.offer(neighbor);
                    }
                    if(color[neighbor] == color[node]) return false;
                }
            }
        }
        return true;
    }
}