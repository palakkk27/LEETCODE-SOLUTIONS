class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        
        int start=0;
        int end=row*column-1;

        int mid = start+(end-start)/2;

        while(start<=end){

            int element = matrix[mid/column][mid%column]; // formula to find element in 2-D array

            if(element==target){
                return true;
            }
            if(element<target){
                start = mid+1;
            }
            if(element>target){
                end = mid-1;
            }

            mid = start +(end-start)/2;
        }

        return false;
    }
}