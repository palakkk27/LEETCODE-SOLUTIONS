class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int ans=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0,j=0;j<n;j++){
            if(hm.containsKey(s.charAt(j))){
                i=Math.max(hm.get(s.charAt(j)),i);
            }
            ans = Math.max(ans,j-i+1);
            hm.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}
//can be solved using hashset and without hashmap also (using for loop)