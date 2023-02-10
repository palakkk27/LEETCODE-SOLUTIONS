/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
     public int guessNumber(int n) {
        return guessnum(1, n);
    }

    public int guessnum(int start, int end){
        int mid = start + (end-start)/2;
        int curr = guess(mid);

        if(curr ==0) {
            return mid;
        }
        if(curr ==-1){
        return guessnum(start,mid-1);
        }
        else {
        return guessnum(mid+1,end);
        }
    
    }
}