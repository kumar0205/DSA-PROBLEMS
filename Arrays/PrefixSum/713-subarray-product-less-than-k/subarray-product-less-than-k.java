class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0,r=0,n=nums.length,prod=1,c=0;
        while(r<n){
            prod*=nums[r];
            while(prod>=k && l<nums.length){
                prod/=nums[l];
                l++;
            }
            if(prod<k) c+=r-l+1;
            r++;
        }
        return c;
    }
}