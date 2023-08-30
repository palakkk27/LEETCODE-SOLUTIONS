class Solution {
    public int beautySum(String s) {
        int bs = 0;
        int limit = s.length();
        
        for(int i= 0;i<limit;i++)
        {
            int[] freq = new int[26];
            for(int j = i;j<limit;j++)
            {
                freq[s.charAt(j)-'a']++;
                bs+=cb(freq);
            }
        }
        return bs;
    }
    
    public static int cb(int freq[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
            if(freq[i] !=0){
                max = Math.max(max,freq[i]);
                min = Math.min(min,freq[i]);
            }
            
        }
        return max-min;
    }
}