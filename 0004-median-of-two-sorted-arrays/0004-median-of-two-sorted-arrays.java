class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Double> list = new ArrayList<>();
        int i=0;int j=0;
        while(i<nums1.length){
            list.add((double)nums1[i++]);
        }
        
        while(j<nums2.length){
            list.add((double)nums2[j++]);
        }
        
        Collections.sort(list);
        int s=0;
        int e = list.size();
        int mid = s+(e-s)/2;
        double total = 0;
        if(e%2==0){
            total = (list.get(mid)+list.get(mid-1))/2;
        }else{
            total = list.get(mid); 
        }
        return total;
    }
}