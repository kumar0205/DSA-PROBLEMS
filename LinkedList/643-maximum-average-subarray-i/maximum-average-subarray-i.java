class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0,r=0,n=nums.length;
        int sum=0,maxsum=0;
        while(r<k){
            sum+=nums[r++];
        }
        maxsum = sum;
        while(r<n){
            sum+=nums[r]-nums[l];
            maxsum= Math.max(maxsum,sum);
            r++;
            l++;
        }
        return (double) maxsum/k;
    }
}