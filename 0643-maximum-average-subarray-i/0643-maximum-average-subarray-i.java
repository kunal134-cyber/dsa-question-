class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int low = 0;
       int high = k;

       int sum = 0;

       for (int i = low;i<high;i++){
        sum += nums[i];
       } 
       int Maxsum = sum;
       while(high < nums.length){

        sum = sum - nums[low];
        low ++;

        sum = sum + nums[high];
        high ++;

        Maxsum = Math.max(sum,Maxsum);
       } 
       return(double) Maxsum/k;
    }
}