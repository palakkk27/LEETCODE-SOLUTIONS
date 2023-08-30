class Solution {
    public int myAtoi(String s) {
        int res = 0;
        int i = 0;
        int sign = 1;
        
        // Remove leading whitespaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        
        // Check for sign
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';  
                        
            // Check for overflow
            if (res > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + digit;
            i++;
        }
        
        return res * sign;
    }
}
