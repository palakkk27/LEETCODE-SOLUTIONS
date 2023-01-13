import java.util.*;
class Solution {
    public int trap(int[] height) {
       

        //calculate left max and right max

        int n = height.length;
        int leftMax[]= new int[n];
        leftMax[0] = height[0]; // initially max height will be at 0
        for (int i = 1; i < n; i++) { //increment to find left highest bar
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        int rightMax[] = new int[n] ; //creating auxillary verbs 
        rightMax[n - 1] = height[n - 1]; 
        for (int i = n-2; i >= 0; i--) { // decrement to find right highest bar 
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }


        int trap= 0;
        for (int i = 0; i <n; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trap += waterlevel - height[i]; // formula to find trapped water 
        }

        return trap;
    }
    // public static void main(String[] args) {
    //     int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
    //     System.out.println(trap(height));
    }

    