class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) nums[i]=nums[i]*-1;
        }
        Arrays.sort(nums);
        long ans=0;
        int l=0,r=nums.length-1;
        while(l<r){
            ans+=(nums[r]*nums[r]) - (nums[l]*nums[l]);
            l++;
            r--;
        }
        if(l==r) ans+=nums[r]*nums[r];
        return ans;
    }
}