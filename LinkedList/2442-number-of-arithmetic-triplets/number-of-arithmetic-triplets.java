class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int c=0,n=nums.length;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if((nums[j] - nums[i] == diff) && (nums[k] - nums[j] == diff)) c++;
                }
            }
        }
        return c;
    }
}