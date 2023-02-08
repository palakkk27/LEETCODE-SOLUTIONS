class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        // int max=0
        for (int i = n - 1; i >= 0; i--){
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        if(digits[0]==0){
            int[] ans = new int[n + 1];
            ans[0] = 1;
            return ans;
        }
        return digits;
    }
}