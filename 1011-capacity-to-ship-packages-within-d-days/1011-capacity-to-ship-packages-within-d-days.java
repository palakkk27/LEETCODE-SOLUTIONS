class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int res=0;
        int s = 0;
        int e = Integer.MAX_VALUE;
        
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isValid(weights,mid,days)){
                res = mid;
                e=mid-1;
            }else{
                s = mid+1;
            }
        }
        return res;
    }
        
        static boolean isValid(int[] arr,int mid,int days){
            int n = arr.length;
            int day = 1;
            int sum = 0;
            
            for(int i=0;i<n;i++){
                
                if(arr[i]>mid)
                    return false;
                
                sum += arr[i];
                if(sum>mid){
                    day++;
                    sum = arr[i];
                }
                if(day > days)
                    return false;
            } 
                return true;
        }
    }
    