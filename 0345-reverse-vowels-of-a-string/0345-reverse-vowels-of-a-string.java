class Solution {
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        Set<Character>vowels=Set.of('a','e','i','o','u','A','E','I','O','U');
        int start=0; int end = s.length()-1;
        while(start<end ){
            if(vowels.contains(arr[start])&&vowels.contains(arr[end])){
                char t = arr[start];
                arr[start] = arr[end];
                arr[end] =  t;
                start++;
                end--;
            }else if(!vowels.contains(arr[start])&&!vowels.contains(arr[end])){
                start++;
                end--;
            }else if(!vowels.contains(arr[start]) && vowels.contains(arr[end])){
                start++;
            }else{
                end--;
            }
        }
        return String.valueOf(arr);
    }
}