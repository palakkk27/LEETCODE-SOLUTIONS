class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for (int j = 0; j <n ; j++) {
                board[i][j] ='.';
            }
        }
        place(0,board,res);
        return res;
    }
    
    
    void place(int col , char board[][],List<List<String>> res){
        if(board.length==col){
            res.add(print(board));
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (allow(board,row,col)){
                board[row][col]='Q';
                place(col+1,board,res);
                board[row][col]='.';
            }
        }
    }

    static boolean allow(char[][] board, int row, int col) {
        int drow = row;
        int dcol = col;
        while(row>=0 && col>=0){
             if (board[row][col]=='Q'){
                return false;
            }
            row--;
            col--;
        }
        row=drow;
        col=dcol;
        while (col>=0){
            if (board[row][col]=='Q'){
                return false;
            }
            col--;
        }
        row=drow;
        col=dcol;
        while (col>=0 && row< board.length){
            if (board[row][col]=='Q'){
                return false;
            }
            col--;
            row++;
        }
        return true;
    }
       private static List<String> print(char[][] board) {
        List < String > res = new ArrayList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}