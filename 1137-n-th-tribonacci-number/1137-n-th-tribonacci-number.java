class Solution {
    public int tribonacci(int n) {

        if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }

        // Scanner sc = new Scanner (System.in);
        // n = sc.nextInt();
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        int t3 = t0+t1+t2;

        System.out.println(t0+" "+t1+" "+t2);

        for(int i = 4; i<=n ; i++){
            t3 = t0+t1+t2;
        System.out.print(" "+t3);
        t0=t1;
        t1=t2;
        t2=t3;
        t3 = t0+t1+t2;


        }
        return t3;
    }
}