class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0,n=nums.length,minlen=Integer.MAX_VALUE,sum=0;
        while(r<n){
            sum+=nums[r];
            while(sum>=target){
                minlen=Math.min(minlen,r-l+1);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        if(minlen==Integer.MAX_VALUE) return 0;
        return minlen;
    }
}