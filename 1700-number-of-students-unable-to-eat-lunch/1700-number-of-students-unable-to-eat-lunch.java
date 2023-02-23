class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // int result=0;

        ArrayList<Integer> studentslist = new ArrayList<>();       
        ArrayList<Integer> sandwichlist = new ArrayList<>();
        
        
        for(int i=0;i<=students.length-1;i++){
            studentslist.add(students[i]);
        } 
        for(int i=0;i<=sandwiches.length-1;i++){
            sandwichlist.add(sandwiches[i]);
        }
        int i=0;
        int count =0;
        while(studentslist.size()!= 0){
               if(studentslist.get(i).equals(sandwichlist.get(i)))
               {
                   count=0;
                   studentslist.remove(i);            
                   sandwichlist.remove(i);
               }
            else{
                count++;
                studentslist.add(studentslist.get(i));
                studentslist.remove(i);           
        }
            if(count==studentslist.size()){
                break;
            }
        }
        
        
     return count;
            

    }
}