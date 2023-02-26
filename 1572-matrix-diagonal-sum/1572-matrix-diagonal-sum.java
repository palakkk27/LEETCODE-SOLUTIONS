class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int r = mat.length;
        int c = mat[0].length;
        for(int i=0; i<r;i++){
            sum+=mat[i][i];
            if(i!=mat.length-i-1)
            sum+=mat[i][mat.length-i-1];
        }
        return sum;
    }
}
