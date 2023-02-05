class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int altitude = 0;
        int max=0;
        
        for(int i=0; i<n;i++){
            altitude += gain[i];
            max = Math.max(max,altitude);
        }
        
        return max;
    }
}