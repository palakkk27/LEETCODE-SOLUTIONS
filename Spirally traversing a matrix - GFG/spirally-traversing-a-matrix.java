//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
       ArrayList<Integer> result = new ArrayList<Integer>();
       int n = matrix.length;
       int sr = 0;
       int er = n-1;
       int sc = 0;
       int ec = matrix[0].length-1;
       
       
       while(sr<=er && sc<=ec){
           //top line --->
           for(int i=sr;i<=ec;i++){
               result.add(matrix[sr][i]);
           }
           
           // right col down 
           for(int j=sr+1;j<=er;j++){
               result.add(matrix[j][ec]);
           }
           
           if(sr==er){
               break;
           }
           //down <--- left 
           for(int i=ec-1;i>=sc;i--){
               result.add(matrix[er][i]);
           }
           
           if(sc==ec){
               break;
           }
           // up  left line
           
           for(int j=er-1;j>=sr+1;j--){
               result.add(matrix[j][sc]);
           }
           
           sc++;
           sr++;
           er--;
           ec--;
       }
       return result;
       
    }
}
