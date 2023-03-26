class Solution {
    public int longestCycle(int[] edges) {
        int longestCycleLen = -1;  // initialize longest cycle length to -1
        int timeStep = 1;  // initialize time step to 1
        int[] nodeVisitedAtTime = new int[edges.length];  // initialize visited time of each node to 0
        
        // traverse the graph from each node
        for (int currentNode = 0; currentNode < edges.length; ++currentNode) {
            // skip nodes that have already been visited
            if (nodeVisitedAtTime[currentNode] > 0)
                continue;
            final int startTime = timeStep;  // record the start time
            int u = currentNode;
            // follow the edges until we reach a visited node or a node with no outgoing edges
            while (u != -1 && nodeVisitedAtTime[u] == 0) {
                nodeVisitedAtTime[u] = timeStep++;  // mark the current node as visited and increment the time step
                u = edges[u];  // follow the edge to the next node
            }
            // check if we've found a cycle and update longest cycle length if the current cycle is longer
            if (u != -1 && nodeVisitedAtTime[u] >= startTime)
                longestCycleLen = Math.max(longestCycleLen, timeStep - nodeVisitedAtTime[u]);
        }

        return longestCycleLen;  // return the length of the longest cycle found
    }
}