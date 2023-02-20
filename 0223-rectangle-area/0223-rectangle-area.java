class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int A1= (ax2-ax1)*(ay2-ay1);
        int A2 =(bx2-bx1)*(by2-by1);

       int x = Math.max(ax1,bx1) < Math.min(ax2,bx2)?(Math.max(ax1,bx1) - Math.min(ax2,bx2)):0;
        int y = Math.max(ay1,by1) < Math.min(ay2,by2)?(Math.max(ay1,by1) - Math.min(ay2,by2)):0 ;

        int common = x*y;
        int totalarea = (A1+A2)-common;
        return totalarea;
    }
}