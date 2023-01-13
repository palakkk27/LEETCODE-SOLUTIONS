class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);
            
            if(sum<0){ 
                sum = 0;
            }
        }
        return max;
    }
}
    //      int currSumm = 0;
    //         int maxSum = Integer.MIN_VALUE;
    //         int prefix[] = new int[num.length];

    //         prefix[0] = num[0];
    //         for (int i = 1; i < prefix.length; i++) {
                
    //             prefix[i] = prefix[i-1]+num[i];
    //         }
    
    //         for (int i = 0; i < num.length; i++) {
    //             int start = i;
    //             for (int j = i; j < num.length; j++) {
    //                 int end = j;

    //                     currSumm = start == 0? prefix[end]: prefix[end]-prefix[start-1];

    //                 // System.out.println(currSumm);
    
    //                 if (maxSum<currSumm) {
    //                     maxSum=currSumm;
    //                 }
    //             }
    //         }
    //         return maxSum; --------------> prefix method , this is also correct but time complexity is o(n^2)
    //     }
    // }
