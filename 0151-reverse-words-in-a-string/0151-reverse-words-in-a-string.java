class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        Stack<String> st = new Stack<String>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<arr.length;i++){
            st.push(arr[i]);
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}