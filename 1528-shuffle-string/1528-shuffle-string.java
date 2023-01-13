class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder("");
    Character ch[] = new Character[indices.length];
        for(int i = 0; i< indices.length ; i++){
        ch[indices[i]] = s.charAt(i);
    }

    for(int i = 0 ; i<ch.length;i++){
        sb.append(ch[i]);

    }
        return sb.toString();// string builder directly return nahi kr skta
    
        }
    }
