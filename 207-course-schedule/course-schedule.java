class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = prerequisites.length;
        ArrayList<Integer> []adj = new ArrayList[numCourses];
        for(int i = 0; i<numCourses; i++){
            adj[i] = new ArrayList<>();
        }
        int [] inD = new int [numCourses];
        for(int i = 0; i<n; i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];

            adj[u].add(v);
            inD[v]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<numCourses; i++){
            if(inD[i] == 0){
                q.offer(i);
            }
        }
        int count = 0;
        while(!q.isEmpty()){
            int course = q.poll();
            count++;

            for(int next : adj[course]){
                inD[next]--;
                if(inD[next] == 0){
                    q.offer(next);
                }
            }

        }
        return count == numCourses;
    }
}