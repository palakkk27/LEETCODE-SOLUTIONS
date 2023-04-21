class Solution {
    public boolean isPerfectSquare(int num) {
       long n = num;
       if(num==1){
           return true;
       }
       if(num==0){
           return false;
       }

       for(int i=num/2;i>0;i--){
           if(i*i==num){
               return true;
        }
        
    }
    return false;
}
}