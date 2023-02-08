class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        
        
        int[][] new_matrix = new int[c][r];
        for(int i =0; i<r;i++){
            for(int j=0;j<c;j++){
                new_matrix[j][i] = matrix[i][j];
            }
            
        }
        return new_matrix;
    }
}