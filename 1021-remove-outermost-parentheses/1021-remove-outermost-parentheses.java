class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
           StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(st.size()>0){
                    sb.append(s.charAt(i));
                }
                st.push(s.charAt(i));
            }
            else{ // this condition is for ')'
                st.pop();
                if(st.size()>0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}