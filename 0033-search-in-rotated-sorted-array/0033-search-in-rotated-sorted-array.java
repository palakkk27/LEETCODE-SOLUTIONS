class Solution {
public int search(int[] nums, int target) {
if(nums.length ==0)
{
if(nums[0]== target)
return 0;
else return -1;
}
for(int i=0;i<nums.length;i++)
{
if(nums[i] == target)
return i;
}
return -1;

}
}