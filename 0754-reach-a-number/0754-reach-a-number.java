class Solution {
    public int reachNumber(int target) {
        int move=0;
        int total=0;
        target=Math.abs(target);
        while(total<target || (total-target)%2!=0){
            move++;
            total +=move;
        }
        return move;
    }
}