class Solution {
    public String decodeString(String s) {
        Stack<Integer> intSt = new Stack<>();
        Stack<String> strSt = new Stack<>();
        StringBuilder cur = new StringBuilder("");
        int num = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num = num*10 +(int)(c - '0') ;
            }else if(c == '['){
                strSt.push(cur.toString());
                intSt.push(num);
                num = 0;
                cur = new StringBuilder("");
            }else if(c == ']'){
                int times = intSt.pop();
                StringBuilder temp = new StringBuilder();
                for(int j = 0; j < times; j++){
                    temp.append(cur.toString());
                }
                cur = new StringBuilder(strSt.pop() + temp.toString());
            }else if(Character.isLetter(c)){
                cur.append(c);
            }
        }
        return cur.toString();
    }
}