class Solution {
    public void rotate(int[][] matrix) {
        //transpose
        int r = matrix.length;
        int c = matrix[0].length;
            int li =0 , ri=matrix[0].length-1;
            while(li<ri){
                int[] temp = matrix[li];
                matrix[li]=matrix[ri];
                matrix[ri]=temp;
                
                li++;
                ri--;
            }
    //reverse 
        for(int i =0; i<r;i++){
            for(int j=i+1;j<c;j++){
                int temp2 = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp2;
            }
        }
    }
}
        