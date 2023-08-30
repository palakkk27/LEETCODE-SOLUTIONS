import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        
        
        int[] freq = new int[26];
        for(int i = 0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i = 0;i<t.length();i++){
            freq[t.charAt(i)-'a']--;
        }
        for(int i = 0;i<26;i++){
            if(freq[i]!=0) return false;
        }
        return true;
    }
}
        
//         HashMap<Character,Integer> hm = new HashMap<>();

//         for (int i = 0; i < s.length(); i++) {
//             char ch=s.charAt(i);
//             if(hm.containsKey(s.charAt(i))){
//                 hm.put(ch,hm.get(ch)+1);
//             }else{
//                 hm.put(ch,1);
//             }
//         }
//          for (int i = 0; i < t.length(); i++) {
//             char ch=t.charAt(i);
//             if(hm.get(ch)!=null){
//                 if(hm.get(ch)==1){
//                     hm.remove(ch);
//                 }else{
//                     hm.put(ch,hm.get(ch)-1);
//                 }
//             }else{
//                 return false;
//             }
//         }
//         return hm.isEmpty();
//     }
// }