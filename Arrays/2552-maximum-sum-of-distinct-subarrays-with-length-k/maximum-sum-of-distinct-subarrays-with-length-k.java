import java.util.HashMap;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        // Bug Fix 1: Change sum and maxsum to long to prevent integer overflow
        int l = 0, r = 0, n = nums.length;
        long sum = 0, maxsum = 0; 
        HashMap<Integer, Integer> hm = new HashMap<>();
        while(r<n){
            hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
            sum+=nums[r];
            while(hm.get(nums[r])>1){
                hm.put(nums[l],hm.get(nums[l])-1);
                if(hm.get(nums[l])==0) hm.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
            if(r-l+1==k) {
                maxsum=Math.max(maxsum,sum);
                hm.put(nums[l],hm.get(nums[l])-1);
                if(hm.get(nums[l])==0) hm.remove(nums[l]);
                sum-=nums[l];
                l++;

            }
            r++;
        }
        return maxsum;
       
    }
}






//  while (r < n) {
//             sum += nums[r];
            
//             if (!hm.containsKey(nums[r])) {
//                 hm.put(nums[r], 1);
//                 if (r - l + 1 == k) {
//                     maxsum = Math.max(maxsum, sum);
//                     sum -= nums[l];
//                     hm.remove(nums[l]);
//                     l++;
//                 }
//             }
//             else {
//                 // Bug Fix 2: Only shrink until the previous instance of nums[r] is removed
//                 while (nums[l] != nums[r]) {
//                     sum -= nums[l];
//                     hm.remove(nums[l]);
//                     l++;
//                 }
//                 // Subtract the matching duplicate element itself from the sum
//                 sum -= nums[l];
//                 // Do NOT remove it from the map, because nums[r] is about to take its place!
//                 l++; 
//             }
//             r++;
//         }
//         return maxsum;