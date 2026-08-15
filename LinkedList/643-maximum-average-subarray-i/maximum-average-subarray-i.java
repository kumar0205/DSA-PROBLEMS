class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0,r=0,n=nums.length;
        double sum=0.0,maxavg=0.0;
        while(r<k){
            sum+=nums[r++];
        }
        maxavg = sum/k;
        while(r<n){
            sum+=nums[r]-nums[l];
            maxavg= Math.max(maxavg,sum/k);
            r++;
            l++;
        }
        return maxavg;
    }
}