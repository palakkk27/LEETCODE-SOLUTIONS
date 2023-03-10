class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<sol> pq= new PriorityQueue<>();
        int temp[] = new int[k];
        for (int i = 0; i < mat.length; i++) {
            int count=0;
        for (int j = 0; j < mat[0].length; j++) {
            count +=  mat[i][j] == 1? 1:0;
        }
        pq.add(new sol(i,count));
        }

        for (int i = 0; i < k; i++) {
           temp[i]=pq.remove().soldier;
        }
        return temp;
    }
     static class sol implements Comparable<sol>{
        int soldier;
        int index;

        public sol(int soldier,int index){
            this.soldier=soldier;
            this.index =index;
        }

        public int compareTo(sol s2){
            int res=0;
            res = this.index - s2.index;
            if(res==0)
            return this.soldier-s2.soldier;
            return res;
        }
    }
}