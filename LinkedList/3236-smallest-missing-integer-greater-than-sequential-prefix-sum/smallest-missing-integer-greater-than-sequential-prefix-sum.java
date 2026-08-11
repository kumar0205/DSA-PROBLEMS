class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        HashSet<Integer> seen = new HashSet<>();
        for(int num:nums){
            seen.add(num);
        }
        // seen.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }
            else{
                break;
            }
            
        }
        // Arrays.sort(nums);
        // for(int i = 0;i<n;i++){
        //     if(sum==nums[i]){
        //         sum++;
        //     }
        //     else if(sum<nums[i]) break;
        // }
        while(seen.contains(sum)) sum++;
        return sum;

    }
}