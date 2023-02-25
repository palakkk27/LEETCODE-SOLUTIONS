class Solution {
    public int[][] generateMatrix(int n) {
        int startRow = 0;
        int endRow = n-1;
        int startCol = 0;
        int endCol = n- 1;
        int num=1;
        int[][] matrix = new int[n][n];
        while(startRow<=endRow && startCol<=endCol){
            // top line to get printed 
            for(int i = startCol; i<= endCol;i++){
                matrix[startRow][i]=num++;
            }

             //right line to get printed 
            for(int j = startRow +1; j<= endRow;j++){
                matrix[j][endCol]=num++;
            }

            // bottom line to get printed 
                if(startRow==endRow){   //-----> prevent duplicate row
                break;
            }
            for(int i = endCol-1; i>= startCol;i--){
                matrix[endRow][i]=num++;
            }


            // left line to get printed 
            if(startCol==endCol){
                break; //-----> prevent duplicate row
            }
            for(int j = endRow-1; j>= startRow+1;j--){
                matrix[j][startCol]=num++;
            }
            startCol++;
            startRow++;
            endRow--;
            endCol--;
        }
    return matrix;
    }
}