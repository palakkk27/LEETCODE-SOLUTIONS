class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
       PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length; j++){
            double frac = (double)arr[i]/arr[j];
                
            pq.add(new Pair(frac, arr[i],arr[j]));
                
            if(pq.size()>k){
                pq.remove(pq.peek());
            }
        }
    }
     return new int[]{pq.peek().val1,pq.peek().val2};
    }
            
            
        public class Pair implements Comparable<Pair>{
        double frac ; 
        int val1 ;
        int val2 ;
        
        Pair(double frac , int val1 , int val2){
            this.frac = frac;
            this.val1 = val1; 
            this.val2 = val2;
        }

        public int compareTo(Pair o){
            if(this.frac > o.frac){
                return 1;
            }
            return -1;
        }
    }
}
    

    