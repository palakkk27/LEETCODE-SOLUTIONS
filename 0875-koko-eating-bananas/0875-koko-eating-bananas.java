class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1_000_000_000;
        
        while(left < right){
            int mid = left + (right - left) / 2;
            if(canEatInTime(piles, mid, h)) 
                right = mid;
            else 
                left = mid + 1;
        }
        return left;
    }
    public boolean canEatInTime(int piles[], int k, int h){
        int hours = 0;
        for(int pile : piles){
            hours += (pile-1)/k+1 ;
            if(hours>h) break;
        }
        return hours <= h;
    }
}