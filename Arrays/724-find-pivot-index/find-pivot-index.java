class Solution {
    public int pivotIndex(int[] nums) {
    int n=nums.length,r=1;
    for(int i=1;i<nums.length;i++){
        nums[i]+=nums[i-1];
     } 
    int mid = n/2,ls=0,rs=0;
    if(nums[n-1]-nums[0]==0) return 0;
    while(r<n){
        ls=nums[r-1] ;
        rs=nums[n-1] - nums[r];
        if(ls==rs) return r;
        r++;
    }
    return -1;
    }
}