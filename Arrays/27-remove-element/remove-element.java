class Solution {
    public int removeElement(int[] nums, int val) {
        int left=0;
        for(int r=0;r<nums.length;r++){
            // if(nums[r]==val) continue;
            if(nums[r]!=val){
                nums[left++]=nums[r];
            }
        }
        return left;
    }
}