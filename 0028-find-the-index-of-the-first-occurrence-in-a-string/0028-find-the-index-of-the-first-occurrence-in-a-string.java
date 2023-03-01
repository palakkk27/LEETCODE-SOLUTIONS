class Solution {
    public int strStr(String haystack, String needle) {
        int a = needle.length();
        int b = haystack.length();

        for(int i = 0; i <= b-a; i++){
            for(int j = 0; j < b; j++){
                if(needle.charAt(j) != haystack.charAt(i+j))
                {
                    break;
                }

                if(j == a-1){
                    return i;
                }
            }
        }
        return -1;
    }
}