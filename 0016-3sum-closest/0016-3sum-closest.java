class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int result = nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int a=i+1;
            int b= nums.length-1;
            
            while(a<b){
                int curr_sum = nums[a]+nums[b]+nums[i];
                if(curr_sum<target){
                    a++;
                }else{
                    b--;
                }
                if(Math.abs(curr_sum - target) < Math.abs(result - target)){
                result = curr_sum; 
                
            }
            
            
        }
    }
        return result;
}
}