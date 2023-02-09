class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;        
        int col = matrix[0].length;
        
        int start = 0;
        int end = col-1;

        
        while(start<row && end>=0){
        int element = matrix[start][end];
            if(element == target){
                return true;
            }
            
            if(element<target){
                start++;
            }
            else{
                end--;
            }
        }
        return false;
    }
}