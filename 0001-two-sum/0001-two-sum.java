class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        for(int i = 0; i < nums.length;i++){
            for(int j = i+1; j<nums.length;j++){
                if(nums[j] == target - nums[i]){
                    ans[0] = j;
                    ans[1] = i;
                    break;
                }
            }

            }

        return ans;
        }
    }