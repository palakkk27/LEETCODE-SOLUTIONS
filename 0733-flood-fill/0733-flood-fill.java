class Solution {
    private void dfs(int inicolor,int newcolor,int[][] image,int row,int col,int ans[][] ,            int delrow[],int delcol[]){
            ans[row][col] = newcolor;
             int n=image.length;
            int m =image[0].length;
            for(int i=0;i<4;i++){
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];
                
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol] ==inicolor && ans[nrow][ncol]!=newcolor)
                {
                   dfs(inicolor,newcolor,image,nrow,ncol,ans,delrow,delcol);
                }
        }

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newcolor) {
        int inicolor = image[sr][sc];
        int[][] ans = image;
        int delrow[] = {-1,0,+1,0};        
        int delcol[] = {0,+1,0,-1};
        dfs(inicolor, newcolor, image,sr,sc,ans,delrow,delcol);
        return ans;
        
}
}