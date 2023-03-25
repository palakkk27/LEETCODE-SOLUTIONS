class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum =0;
        for(int i=0;i<salary.length;i++){
            sum += salary[i];
        }
        sum = sum-(salary[0]+salary[salary.length-1]);
        double avg = sum/ (salary.length-2);
        return avg;
    }
}