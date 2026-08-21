class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n=nums.length;
        int max=0;
        long [] ans = new long[n];
        ans[0]=nums[0]*2;
        max=nums[0];
        for(int i=1;i<n;i++){
            if (nums[i] > max) {
                max = nums[i];
            }
            ans[i]=nums[i]+max+ans[i-1];
        }
        return ans;
    }
}