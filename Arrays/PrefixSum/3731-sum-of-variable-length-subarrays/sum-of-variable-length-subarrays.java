class Solution {
    public int subarraySum(int[] nums) {
        int sum=0,n=nums.length;
        int [] ps= new int[n];
        ps[0]=nums[0];
        for(int i=1;i<n;i++){
            ps[i]=nums[i]+ps[i-1];
        }
        sum+=nums[0];
        for(int i=1;i<n;i++){
           int start = Math.max(0,i-nums[i]);
            if(start==0)  sum+=ps[i];
            else sum+=ps[i]-ps[start-1];
        }
        return sum;
    }
}