class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int f = flowerbed.length;
        int count=0;
         if(n==0) return true;
        for(int i=0;i<f;i++){
           if(flowerbed[i]==0){
               boolean lpe = i==0 || flowerbed[i-1]==0;           
               boolean rpe = (i==f-1) || flowerbed[i+1]==0;
               
               
               if(lpe&&rpe){
                   flowerbed[i]=1;
                   count++;
               }
               
               if(count==n){
                   return true;
               }
           }
        }
        return false;
    }
}