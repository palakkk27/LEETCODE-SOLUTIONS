class Solution {
    public String frequencySort(String s) {
        char[] str = s.toCharArray();
        HashMap<Character , Integer> hm = new HashMap<>();
        for(char c:str){
        if(hm.containsKey(c)){
            hm.put(c,hm.get(c)+1);
        }else{
            hm.put(c,1);
        }
    }
        ArrayList<Character> al = new ArrayList<>(hm.keySet());
        Collections.sort(al,(a,b)->hm.get(b)-hm.get(a));
        StringBuilder sb = new StringBuilder();
        
        for(Character c:al){
             for(int i=0;i<hm.get(c);i++){
            sb.append(c);
        }
    }
    
    return sb.toString();
     }
}