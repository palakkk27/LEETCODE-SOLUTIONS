class Solution {
    public int[] findErrorNums(int[] nums) {
        long n = nums.length;
        long s1 = n*(n+1)/2;
        long s2n = (n*(n+1)*(2*n+1))/6;

        long s=0, s2=0;
        for(int i=0;i<n;i++){
            s+=nums[i];
            s2+=(long)nums[i]*(long)nums[i];
        }
        long val1 = s-s1;
        long val2 = s2 - s2n;

        val2 = val2/val1;

        long x = (val1+val2)/2;
        long y = x-val1;
        int[] ans = {(int)x,(int)y};

        return ans;
    }
}