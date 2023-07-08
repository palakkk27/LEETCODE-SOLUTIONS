class Solution {
    public long putMarbles(int[] weights, int k) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        
        for(int i=0;i<weights.length-1;i++){
            pq1.add(weights[i] + weights[i+1]);
            pq2.add(weights[i]+weights[i+1]);
            
            if(pq1.size()>k-1){
                pq1.poll();
                pq2.poll();
            }
        }
        
        long ans1 = 0 , ans2 = 0;
        while(!pq1.isEmpty()){
            ans1+=pq1.poll();
            ans2+=pq2.poll();
        }
        
        return ans2-ans1;
    }
}