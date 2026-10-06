class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3) return 0;
        int diff = nums[1]-nums[0];
        int l=0,length=0,c=0;
        for(int i=1;i<nums.length;i++){
            if((nums[i]-nums[i-1])!=diff){
                if(i-l>=3) {
                    length=i-l;
                    c+=((length - 1) * (length - 2)) / 2;
                }
                l = i - 1; // Restart window from the start of the new pair transition
                diff = nums[i] - nums[i-1]; 
            }    
        }
        if (nums.length - l >= 3) {
            length = nums.length - l;
            c += ((length - 1) * (length - 2)) / 2;
        } 
        return c;
    }
}