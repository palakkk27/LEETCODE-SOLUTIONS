class Solution {
            Stack<Integer> s = new Stack<>();
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int nextG[] = new int[n];
        
        for(int i=0;i<n;i++){
            while(!s.isEmpty()&&nums[s.peek()]<nums[i])
            {
                nextG[s.pop()]=nums[i];
            }
            s.push(i);
        }
        
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && nums[s.peek()] < nums[i])
            {
                nextG[s.pop()]=nums[i];
            }
        }
        
        while(!s.isEmpty()){
            nextG[s.pop()]=-1;
        }
        return nextG;
    }
}