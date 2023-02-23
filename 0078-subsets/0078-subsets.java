class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        list.add(new ArrayList());
        for(int num:nums){
            int n= list.size();
            for(int j=0;j<n;j++){
                List<Integer> temp = new ArrayList(list.get(j));
                temp.add(num);
                list.add(temp);
                
            }
            
        }
        return list;
    }
}