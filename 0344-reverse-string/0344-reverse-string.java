class Solution {
    public void reverseString(char[] s) {

//2pointer approach
         int start = 0;
         int end = s.length-1;

         char[] ans = swap(s,start,end);
         System.out.println(Arrays.toString(ans));
    }

   static char[] swap(char s[], int start,int end){
        while(start<end){
        char temp;
        temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        start++;
        end--;
        
    }

    return s;
        
    }
}