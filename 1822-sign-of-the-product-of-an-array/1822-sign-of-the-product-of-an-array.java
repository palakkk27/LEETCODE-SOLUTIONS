class Solution {
    public int arraySign(int[] nums) {
        int n = nums.length;
        int product = 1;
        for(int i:nums){
        if(i<0){ 
            product *= -1; 
        }else if(i>0){ 
            product *= 1;
        }else{
            return 0;
        }
          
    }
          return product;
}
}