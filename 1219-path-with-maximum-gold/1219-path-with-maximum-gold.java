class Solution {
    public int getMaximumGold(int[][] grid) {
        int maxG=0;
        int row=grid.length;
        int col = grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]!=0){
                    int data = getgold(grid,i,j);
                    maxG = Math.max(maxG,data);
                }
            }
        }
        return maxG;
    }
    
    public int getgold(int grid[][],int i,int j){
        if(i<0||i>grid.length-1||j<0||j>grid[0].length-1||grid[i][j]==0){
            return 0;
        }
        int temp = grid[i][j];
        grid[i][j] = 0;
        
        int up = getgold(grid,i,j-1);        
        int down = getgold(grid,i,j+1);
        int right = getgold(grid,i+1,j);
        int left = getgold(grid,i-1,j);
        
        grid[i][j] = temp;
        
        return grid[i][j]+Math.max(up, Math.max(down, Math.max(right,left)));
    }
}