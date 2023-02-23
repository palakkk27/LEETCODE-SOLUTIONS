class Solution {
    
    public int sum(int n){
        int sum=0;
        while(n>0){
            int d = n%10;
            n=n/10;
            
            sum +=d*d;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        while(n!=1 && n!=4){
            n=sum(n);
        }
        return n==1;
    }
}