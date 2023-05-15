class Solution {
    public int mostFrequentEven(int[] nums) {
       HashMap<Integer, Integer> map=new HashMap<>();
        for(int s:nums){
            if(s%2==0){
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }
        
        int res=-1;
        int mx=0;
        for(var x:map.entrySet()){
            int a = x.getKey();
            int b = x.getValue();
            
            if(mx<b || (mx == b && res > a)){
                mx=b;
                res=a;
            }
        }
        return res;
    }
}