class Solution {
    public int removeDuplicates(int[] nums) {
        int indx=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[indx]=nums[i];
                indx++;
            }
        }
        return indx;
    }
}