class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       return atmost(nums,goal)-(goal-1>-1?atmost(nums,goal-1):0);
}
    public int atmost(int nums[],int goal){
        int si = 0;
        int ei = 0;
        int ts = 0;
        int sum = 0; int n = nums.length;
        
        while(ei<n){
            sum+=nums[ei++];
            while(sum>goal){
                sum-=nums[si++];
            }
            ts +=ei-si;
        }
        return ts;
    }
}