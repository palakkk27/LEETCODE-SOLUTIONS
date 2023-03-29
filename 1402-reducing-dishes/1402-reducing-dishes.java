class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int runningSum=0;
        int result=0;
        int size = satisfaction.length;
        for(int i=size-1 ;i>=0 && satisfaction[i]+runningSum>0;i--){
            runningSum+=satisfaction[i];
            result+=runningSum;
        }
        return result;
    }
}