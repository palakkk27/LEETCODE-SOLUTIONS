class Solution {
    public String getHint(String secret, String guess) {
        int n[] = new int[10];
        int bulls = 0;
        int cows=0;
        for(int i=0;i<secret.length();i++){
            int s = Character.getNumericValue(secret.charAt(i));
            int g = Character.getNumericValue(guess.charAt(i));

            if(s==g){
                bulls++;
            }
            else{
                if(n[s]++<0) cows++;
                if(n[g]-->0) cows++;
            }
        }
        return bulls + "A" + cows + "B";
    }
}