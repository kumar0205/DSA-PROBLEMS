class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0,prev=-10009,freq=0;
        for(int i =0;i<nums.length;i++){
            if(prev!=nums[i]){
                freq=0;
                prev= nums[i];
            }
            if(freq<2){
                    nums[left++]=nums[i];
                    freq++;
                }
            
        }
        return left;

    }
}