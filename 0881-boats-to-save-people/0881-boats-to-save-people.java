class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int p = people.length-1;
        int l = 0;
        int ans = 0;

        Arrays.sort(people);
        while(l<=p){
            ans++;
            if(people[l]+people[p]<=limit)
                l++;
                p--;
        }
        return ans;
    }
}