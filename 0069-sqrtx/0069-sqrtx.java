class Solution {
    public int mySqrt(int x) {
        //using binary search
        int s=1;
        int e = x;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(x/mid==mid){
                return mid;
            }
            else if(x/mid<mid){
                e=mid-1;
            }else{
                s=mid+1;
            }

        }
        return e;
    }
}