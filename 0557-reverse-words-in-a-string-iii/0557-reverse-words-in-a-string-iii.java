class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start=0;
        int end ;
        for(end = 0;end<=arr.length;end++){
            if(end==arr.length || arr[end] == ' '){
                reverse(arr,start,end-1);
                start = end+1;
            }
        }
        return new String(arr);
        
    }
     private void reverse(char[] c, int start, int end) {
        while (start < end) {
            char tmp = c[end];
            c[end] = c[start];
            c[start] = tmp;
            start++;
            end--;
        }
    }
}
