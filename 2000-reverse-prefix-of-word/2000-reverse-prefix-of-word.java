class Solution {
    public String reversePrefix(String word, char ch) {
        char arr[] = word.toCharArray();
        int s = 0;
        int index = 0;
        int e = word.length();
        for(int i = 0;i<e;i++){
            if(word.charAt(i)==ch){
                index = i;
                break;
            }
        }

        char res[]  = new char[word.length()];
        for(int i=0;i<=index;i++){
           res[i]  = arr[index-i]; 
        }

        for(int i=index+1;i<e;i++){
            res[i] = arr[i];
        }

        return String.valueOf(res);
    }
}