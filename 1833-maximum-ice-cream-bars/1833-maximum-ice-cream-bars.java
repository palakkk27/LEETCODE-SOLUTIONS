class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int answer = 0 , i = 0; // make a counter to count the max number of icecreams

        while(i < costs.length && coins >= costs[i]){

            coins = coins - costs[i];// Reduce the amount of money we have left by the cost                                     of the current ice cream cone.

        answer++; // no of icecreams bought 
        i++; // move on to next index
        }

    return answer;
    }
}