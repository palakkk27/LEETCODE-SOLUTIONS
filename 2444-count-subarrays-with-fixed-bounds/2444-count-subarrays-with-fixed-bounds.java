class Solution {
    public long countSubarrays(int[] N, int minK, int maxK) {
        long ans = 0;
        int minI = -1; 
        int maxI = -1; 
        int start = 0;
        for(int i=0; i<N.length; i++)
        {
            if(N[i]<minK || N[i]>maxK)
            {
                minI = -1; maxI = -1;
                start = i+1;
            }

            if(N[i]==minK)
            {
                minI = i;
            }

            if(N[i]==maxK)
            {
                maxI = i;
            }
            
            ans = ans+Math.max(0L, Math.min(minI, maxI)-start+1);
        }
        return ans;
    }
}