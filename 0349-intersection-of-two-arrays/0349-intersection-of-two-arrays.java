class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> finalset = new HashSet<>();
        

        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }

        for(int j=0;j<nums2.length;j++){
            if(set.contains(nums2[j])){
                finalset.add(nums2[j]);
            }
        }

        int i=0;
        int ans[] = new int[finalset.size()];
        for(int val: finalset){
            ans[i++] = val;
        }
        return ans;
        
    }
}