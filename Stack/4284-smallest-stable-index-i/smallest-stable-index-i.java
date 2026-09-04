class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        if(n==1) return 0;
        int suf[] = new int[n];
        suf[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            if(suf[i+1]<nums[i]) suf[i]=suf[i+1];
            else suf[i]=nums[i];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(max-suf[i]<=k) return i;

        }
        return -1;
    }
}