class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1,zeroindex=0,zc=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0) prod=prod*nums[i];
            else{
                 zeroindex=i;
                 zc++;
            }
        }
        for(int i=0;i<n;i++){
            if(zc>1) nums[i]=0;
            else if(zc==1 && zeroindex==i) nums[i]=prod;
            else if(zc==1) nums[i]=0;
            else{
                nums[i]=prod/nums[i];
            } 
        }
        return nums;

    }
}