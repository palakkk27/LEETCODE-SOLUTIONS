class Solution {
    public boolean judgeCircle(String moves) {
        int a=0;
        int b=0;
         for (int i = 0; i < moves.length(); i++) {
                char dir = moves.charAt(i);
        
        if(dir=='L'){
            a--;
        }
        else if(dir=='R'){
            a++;
        }
        else if(dir=='U'){
            b++;
        }
        else{
            b--;
        }

}
  return(a==0&&b==0);
    }
}