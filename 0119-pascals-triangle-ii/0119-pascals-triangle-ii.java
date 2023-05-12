class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>ans = new ArrayList<>();
        if(rowIndex==0){
            return List.of(1);
        }

        ans.add(1);
        long temp = 1;
        for(int i=0;i<rowIndex;i++){
            temp *= rowIndex-i;
            temp  = temp /(i+1);
            ans.add((int) temp);
        }
        return ans;
    }
}