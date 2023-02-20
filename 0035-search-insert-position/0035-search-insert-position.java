class Solution {
    public int searchInsert(int[] nums, int target) {

        int n = nums.length;
        if (target > nums[n-1]) //outside of the last index
            return n;
        if (target < nums[0]) //outside from the left side of array
            return 0;
        int start=0;
        int end = nums.length-1; int mid =-1;
        while(start<=end){
            mid = start +(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }

        }
        if (target < nums[mid])
            return mid;
        else 
            return mid + 1;
    }
}