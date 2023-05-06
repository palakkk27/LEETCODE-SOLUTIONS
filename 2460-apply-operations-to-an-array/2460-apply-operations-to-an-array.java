class Solution {
    public int[] applyOperations(int[] nums) {
        
        int n[] = new int[nums.length];
        
       for(int i=0;i<nums.length-1;i++){
           if(i + 1 < nums.length && nums[i]==nums[i+1]){
               nums[i] *= 2;
               nums[i+1]=0;
           }
       }
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                n[k++]=nums[i];
            }
       }        
        return n;
    }
}