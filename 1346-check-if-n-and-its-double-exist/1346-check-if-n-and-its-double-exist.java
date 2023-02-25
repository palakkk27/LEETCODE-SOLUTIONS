class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int s = 0;
            int e = arr.length-1;
            while(s<=e){
                int mid = s+(e-s)/2;
                if(arr[mid]==2*arr[i] && mid !=i){
                    return true;
                }
                else if(arr[mid] > 2*arr[i]){
                    e = mid-1;
                }else{
                    s=mid+1;
                }
            }
        }
        return false;
    }
}