class Solution {
    public int majorityElement(int[] nums) {
        //MOORE'S ALGORITHM
        int n = nums.length;
        int count = 0;
        int element = 0;
        
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                element = nums[i];
            }else if(element==nums[i]) count++;
            else{
                count--;
            }
        }
        
        int c=0;
        for(int i=0;i<n;i++){
            if(element==nums[i]){
                c++;
            }
            
            if(c>(n/2))
                return element;
        }
        return -1;
    }
}