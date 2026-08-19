class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int sum=0,c=0;
        for(int num : nums){
            sum+=num;
            if(sum==0) c++;
        }
        return c;
    }
}