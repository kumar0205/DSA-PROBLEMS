import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Use a HashSet to handle any size of integer (positive, negative, large)
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // If the element is already in our window of size k, we found a nearby duplicate!
            if (set.contains(nums[i])) {
                return true;
            }
            
            // Add the current element to the window
            set.add(nums[i]);
            
            // Maintain the sliding window size: remove the oldest element if window exceeds k
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        
        return false;
    }
}
