class Solution {
    public int[] leftRightDifference(int[] nums) {
    int n=nums.length;
     int [] pres=new int[n];
     int [] suf = new int[n];
     int [] ans=new int[n];
     pres[0]=0;
     for(int i=1;i<n;i++){
        pres[i]=nums[i-1]+pres[i-1];
     }
     suf[n-1]=0;
     for(int i=n-2;i>=0;i--){
        // sum+=nums[n-i]
        suf[i]=suf[i+1]+nums[i+1];
     }
     ans[n-1]=pres[n-1];
     ans[0]=suf[0];
     for(int i=1;i<=n-2;i++){
        ans[i]=Math.abs(pres[i]-suf[i]);
     }
     return ans;

    }
}