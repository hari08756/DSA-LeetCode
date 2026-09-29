class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n = prerequisites.length;
        ArrayList<Integer> [] adj = new ArrayList[numCourses];
        for(int i = 0; i<numCourses; i++){
            adj[i] = new ArrayList<>();
        }

        int [] inD = new int[numCourses];
        for(int i = 0; i<n; i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];

            adj[v].add(u);
            inD[u]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<numCourses; i++){
            if(inD[i] == 0) q.offer(i);
        }

        int [] ans = new int[numCourses];
        int k = 0;
        while(!q.isEmpty()){
            int course = q.poll();
            ans[k++] = course;
            for(int next : adj[course]){
                inD[next]--;
                if(inD[next] == 0) q.offer(next);
            }
        }
        if(k != numCourses) return new int[0];
        return ans;
    }
}