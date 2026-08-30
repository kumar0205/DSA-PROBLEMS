class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n <= 1) return n;
        
        int mini = 0, maxi = 0;
        // Find indices of the minimum and maximum elements
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[mini]) mini = i;
            if (nums[i] > nums[maxi]) maxi = i;
        }
        
        // Let's call the smaller index 'left' and the larger index 'right'
        int left = Math.min(mini, maxi);
        int right = Math.max(mini, maxi);
        
        // Scenario 1: Delete both from the left side
        int bothFromLeft = right + 1;
        
        // Scenario 2: Delete both from the right side
        int bothFromRight = n - left;
        
        // Scenario 3: Delete one from the left and one from the right
        int oneFromEachSide = (left + 1) + (n - right);
        
        // Return the absolute minimum of these three choices
        return Math.min(bothFromLeft, Math.min(bothFromRight, oneFromEachSide));
    }
}