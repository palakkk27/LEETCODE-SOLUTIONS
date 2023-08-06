//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s; 
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.checkRedundancy(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int checkRedundancy(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                boolean flag = false;
                while(!st.isEmpty() &&st.peek() !='('){
                    char top = st.pop();
                    if(top=='+' || top=='-'||top=='*'||top=='/'){
                        flag = true;
                    }
                }
                st.pop();
                if(flag==false){
                    return 1;
                }
            }else{
                st.push(s.charAt(i));
            }
        }
        return 0;
    }
}
        
