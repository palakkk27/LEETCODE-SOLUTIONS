class Solution {
    public String intToRoman(int num) {
       HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1000, "M");
        hm.put(900,"CM");
        hm.put(500, "D");
        hm.put(400, "CD");
        hm.put(100, "C");
        hm.put(90, "XC");
        hm.put(50, "L");
        hm.put(40, "XL");
        hm.put(10, "X");
        hm.put(9, "IX");
        hm.put(5, "V");
        hm.put(4, "IV");
        hm.put(1, "I");

         int k[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
         String ans = "";
        while(num>0){
            for(int i=0;i<k.length;i++){
                if(num-k[i]>=0){
                    num = num-k[i];
                    ans += hm.get(k[i]);
                    break;
                }
            }

        }
        return ans;
    }
}