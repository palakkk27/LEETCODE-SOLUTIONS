class Solution {
    public List<String> letterCombinations(String digits) 
    {
        List<String> ans = new ArrayList<>();
        
        if(digits.length() == 0)
            return ans;
        
        HashMap<Character,String> map = new HashMap<Character,String>();
        
        map.put('2' , "abc");
        map.put('3' , "def");
        map.put('4' , "ghi");
        map.put('5' , "jkl");
        map.put('6' , "mno");
        map.put('7' , "pqrs");
        map.put('8' , "tuv");
        map.put('9' , "wxyz");
        
        generate_all_combinations(digits , 0 , "" , ans , map);
        return ans;
    }
    
    private void generate_all_combinations(String s , int current_index , String current_string , List<String> ans , HashMap<Character,String> map)
    {  
        if(current_index >= s.length())
        {
            ans.add(current_string);
            return;
        }
        
        char current_char = s.charAt(current_index);
        String mappings = map.get(current_char);
        
        for(int i=0; i<mappings.length() ; i++)
            generate_all_combinations(s , current_index+1 , current_string+ mappings.charAt(i) , ans , map);        
    }
}