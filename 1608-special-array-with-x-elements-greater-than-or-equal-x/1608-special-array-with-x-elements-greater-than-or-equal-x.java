class Solution {
    public int specialArray(int[] nums) {
        int s=0;
        int e = nums.length;
        while(s<=e){
            int mid = s+(e-s)/2;
            int count =0;
            for(int i=0;i<nums.length;i++){
            if(nums[i]>=mid){
                count++;
            }
        }
            if(count==mid){
                return mid;
            }
            else if(count>mid){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
    }
}