class Solution {
    public int minStartValue(int[] nums) {
    int min=0;
    if(nums[0]<0) min=nums[0];
    for(int i=1;i<nums.length;i++){
        nums[i]+=nums[i-1];
        min=Math.min(min,nums[i]);
    }
    if(min<0) return -1*min+1;
    return min+1;
     
    }
}