class Solution {
    public int minScore(int n, int[][] roads) {
        List<List<int[]>> adjList = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] road : roads){
            adjList.get(road[0]).add(new int[]{road[1], road[2]});
            adjList.get(road[1]).add(new int[]{road[0], road[2]});
        }

        Integer minpath = Integer.MAX_VALUE;
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[n + 1];
        visited[1] = true;
        q.add(1);

        while(!q.isEmpty()){
            int temp = q.poll();
            for(int[] path : adjList.get(temp)){
                minpath = Math.min(minpath, path[1]);
                if(!visited[path[0]]){
                    q.add(path[0]);
                    visited[path[0]] = true;
                }
            }
        }
        return minpath;
    }
}