class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int num[] = new int[n+1];
        for(int i=0;i<n+1;i++){
            num[i]=i;
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n+1;i++){
            hs.add(num[i]);
        }
        
       for(int i=0; i<nums.length; i++)
        {
            if(hs.contains(nums[i]))
            {
                hs.remove(nums[i]);
            }
        }
        
        int res=0;
        for(int i: hs){
            res=i;
        }
        return res;
        }
}