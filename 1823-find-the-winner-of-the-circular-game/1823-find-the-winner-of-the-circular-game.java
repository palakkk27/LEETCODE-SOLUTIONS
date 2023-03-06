class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        return way(n,k,list,0);
    }
    public int way(int n,int k ,ArrayList<Integer> list ,int start) {
        if(n>1){
            int curr = (start+k-1)%n;
            list.remove(list.get(curr));
            way(n-1,k,list,curr);
        }
        return list.get(0);
    }
}