class Solution {
     public List < List < Integer >> combinationSum(int[] candidates, int target) {
        List < List < Integer >> ans = new ArrayList < > ();
        findcomb(0, candidates, target, ans, new ArrayList < > ());
        return ans;
    }
    
    public void findcomb(int ind , int arr[] , int target ,  List < List < Integer >> ans , List < Integer > ds){
        //if traversal gets completed and target achieved
        if(ind == arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        
        if(arr[ind]<=target){
            ds.add(arr[ind]);
            findcomb(ind , arr,target - arr[ind] , ans , ds);
            ds.remove(ds.size()-1);
        }
        //not pick
        findcomb(ind + 1, arr, target, ans, ds);
    }
    
}