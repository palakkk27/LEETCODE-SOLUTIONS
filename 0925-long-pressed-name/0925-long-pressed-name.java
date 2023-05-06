class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0;int j=0;
        int m = name.length();
        int n = typed.length();
        
        if(name.charAt(0) != typed.charAt(0))
            return false;
        
        if(n<m){
            return false;
        }
        
        while(i<m&j<n){
            if(name.charAt(i) == typed.charAt(j)){
                i++;j++;
            }else if(name.charAt(i-1)==typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }
        while(j<n){    
            if(name.charAt(i-1) == typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }
        if(i<m){   
            return false;
        }
        return true;       
    }
}
        