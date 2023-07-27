class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] count = new int[26];

        int start = 0;
        int maxlen = 0;
        int maxcount = 0;

        for (int end = 0; end < n; end++) {
            count[s.charAt(end) - 'A']++;
            int currcount = count[s.charAt(end) - 'A'];
            maxcount = Math.max(maxcount, currcount);

            while ((end - start + 1 - maxcount) > k) { // Corrected the condition
                count[s.charAt(start) - 'A']--;
                start++;
            }
            maxlen = Math.max(maxlen, end - start + 1);
        }
        return maxlen;
    }
}








// class Solution {
//     public int characterReplacement(String s, int k) {
//         HashSet<Character> allLetters = new HashSet();

//         // collect all unique letters
//         for (int i = 0; i < s.length(); i++) {
//             allLetters.add(s.charAt(i));
//         }

//         int maxLength = 0;
//         for (Character letter : allLetters) {
//             int start = 0;
//             int count = 0;
//             // initialize a sliding window for each unique letter
//             for (int end = 0; end < s.length(); end++) {
//                 if (s.charAt(end) == letter) {
//                     // if the letter matches, increase the count
//                     count ++;
//                 }
//                 // bring start forward until the window is valid again
//                 while (!isWindowValid(start, end, count, k)) {
//                     if (s.charAt(start) == letter) {
//                         // if the letter matches, decrease the count
//                         count --;
//                     }
//                     start ++;
//                 }
//                 // at this point the window is valid, update maxLength
//                 maxLength = Math.max(maxLength, end - start+1);
//             }
//         }
//         return maxLength;
//     }

//     private Boolean isWindowValid(int start, int end, int count, int k) {
//         return end - start - count +1 <= k;
//     }
// }