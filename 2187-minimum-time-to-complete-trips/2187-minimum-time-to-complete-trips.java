class Solution {
    public long minimumTime(int[] time, int totalTrips) {
       long s = 0, e = 100_000_000_000_000L;
        while(s<=e){
            long mid = s+(e-s)/2;
            long trips = 0;
            for (int t : time) {
                trips += mid / t;
            }
            
            if(trips<totalTrips){
                s=mid+1;
            }else {
                e=mid-1;
            }
        }
        return s;
    }
}