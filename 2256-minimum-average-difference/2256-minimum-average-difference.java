class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long min = Integer.MAX_VALUE;
        long sum = 0;
        long s = 0;
        long e = 0;
        int pos=0;

        for(int i=0 ;i<n;i++){
            sum += nums[i];
        }

        long val=0;
        for(int i=0;i<n;i++){
            s+= nums[i];
            e = sum - s;
            if(i==n-1){
               val = Math.abs(s/(n));
            }
            else if(i<n-1){
                val = Math.abs((s/(i+1)) - (e/(n-i-1)));
            }
            if(val < min){
                min = val;
                pos = i;
            }
        }
        return pos;
    }
}