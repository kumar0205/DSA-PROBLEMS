class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,n=nums.length,maxcon=0;
        while(r<n){
            if(nums[r]==0){
                if(k!=0) k--;
                else{
                    while(nums[l]!=0) l++;
                    l++;
                }
            }
        maxcon=Math.max(maxcon,r-l+1);
        r++;
        }
        return maxcon;
    }
}