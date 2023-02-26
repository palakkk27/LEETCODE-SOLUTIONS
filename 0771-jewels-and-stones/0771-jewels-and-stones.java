class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Integer,Character> hm = new HashMap<>();
        int count =0;
        for(int i=0;i<jewels.length();i++){
            char j = jewels.charAt(i);
            hm.put(i,j);
        }
        
        for(int i=0;i<stones.length();i++){
            char s = stones.charAt(i);
            if(hm.containsValue(s)){
                count++;
            }
        }
        return count;
    }
}