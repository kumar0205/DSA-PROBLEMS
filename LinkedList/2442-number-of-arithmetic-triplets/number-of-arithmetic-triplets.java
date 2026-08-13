class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int c=0,n=nums.length;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(nums[j] - nums[i] > diff) break;
                if(nums[j] - nums[i] == diff) {
                    
                    for(int k=j+1;k<n;k++){
                        if(nums[k] - nums[j] > diff) break;
                        if(nums[k] - nums[j] == diff) {
                            c++;
                            break;
                        }
                    }
                }
            }
        }
        return c;
    }
}