import java.util.*;

class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        
        // Handle Case 1
        if (k == n) {
            int maxVal = -1;
            for (int num : nums) {
                maxVal = Math.max(maxVal, num);
            }
            return maxVal;
        }
        
        // Track overall frequencies
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        
        // Handle Case 2
        if (k == 1) {
            int maxKey = -1;
            for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
                if (entry.getValue() == 1) {
                    maxKey = Math.max(maxKey, entry.getKey());
                }
            }
            return maxKey;
        }
        
        // Handle Case 3
        int firstElement = nums[0];
        int lastElement = nums[n - 1];
        int ans = -1;
        
        if (counts.get(firstElement) == 1) {
            ans = Math.max(ans, firstElement);
        }
        if (counts.get(lastElement) == 1) {
            ans = Math.max(ans, lastElement);
        }
        
        return ans;
    }
}
