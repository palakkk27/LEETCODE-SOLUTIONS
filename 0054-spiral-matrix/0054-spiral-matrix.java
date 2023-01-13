class Solution {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int n = matrix.length;
        int startRow = 0;
        int endRow = n-1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while(startRow<=endRow && startCol<=endCol){
            // top line to get printed 
            for(int i = startCol; i<= endCol;i++){
                result.add(matrix[startRow][i]);
            }

             //right line to get printed 
            for(int j = startRow +1; j<= endRow;j++){
                result.add(matrix[j][endCol]);
            }

            // bottom line to get printed 
                if(startRow==endRow){   //-----> prevent duplicate row
                break;
            }
            for(int i = endCol-1; i>= startCol;i--){
                result.add(matrix[endRow][i]);
            }


            // left line to get printed 
            if(startCol==endCol){
                break; //-----> prevent duplicate row
            }
            for(int j = endRow-1; j>= startRow+1;j--){
                result.add(matrix[j][startCol]);
            }



            startCol++;
            startRow++;
            endRow--;
            endCol--;

        }
    return result;
    }
}