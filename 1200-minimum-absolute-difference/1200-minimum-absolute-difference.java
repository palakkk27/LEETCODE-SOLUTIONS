class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> l = new ArrayList<>();

        for(int i=0;i<arr.length-1;i++){
            min = Math.min(arr[i+1]-arr[i],min);
        }
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==min){
               List<Integer> sum = new ArrayList<>(); 
                sum.add(arr[i]);
                sum.add(arr[i+1]);
                l.add(sum);
            }
        }
        return l;
        
    }
}