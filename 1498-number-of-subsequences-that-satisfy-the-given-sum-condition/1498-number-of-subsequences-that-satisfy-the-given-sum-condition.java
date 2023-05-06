class Solution {
    public int numSubseq(int[] nums, int target) {
        final int kMod = 1_000_000_007;
        final int n = nums.length;
        int[] pows = new int[n]; // pows[i] = 2^i % kMod
        pows[0] = 1;

    for (int i = 1; i < n; ++i){
        pows[i] = pows[i - 1] * 2 % kMod;

    }
        Arrays.sort(nums);
        int ans = 0;
         for (int start = 0, end = n - 1; start <= end;)
            if(nums[start]+nums[end]<=target){
                ans+=pows[end-start];
                ans%=kMod;
                ++start;
            }else{
            --end;
            }
        
        return ans;
    }
}