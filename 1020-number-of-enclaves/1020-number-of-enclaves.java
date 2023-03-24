class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<Pair>();
        int vis[][] = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0 || i==n-1 || j==m-1){
                  if(grid[i][j]==1){
                        q.add(new Pair(i,j));
                        vis[i][j]=1;
                  }
                }
            }
        }
        
        int []delrow = {-1,0,+1,0};
        int []delcol = {0,+1,0,-1};
        
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            q.remove();
            for(int i=0;i<4;i++){
                int nrow = r + delrow[i];
                int ncol = c + delcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m 
                   && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    q.add(new Pair(nrow,ncol));
                    vis[nrow][ncol] = 1;
                }
            }
        }
        
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}