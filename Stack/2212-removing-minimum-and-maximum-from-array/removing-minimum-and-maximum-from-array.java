class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int mine = nums[0], maxe = nums[0], mini = 0, maxi = 0;
        
        // Your exact original loop
        for (int i = 1; i < n; i++) {
            if (mine > nums[i]) {
                mine = nums[i];
                mini = i;
            }
            if (maxe < nums[i]) {
                maxe = nums[i];
                maxi = i;
            }
        }
        
        // Map to left and right so we always know which one comes first
        int left = Math.min(mini, maxi);
        int right = Math.max(mini, maxi);
        
        // Calculate the costs of the 3 real scenarios
        int bothFromLeft = right + 1;
        int bothFromRight = n - left;
        int pincer = (left + 1) + (n - right);
        
        // Your if/else structure applied to the costs instead of 'mid'
        if (bothFromLeft <= bothFromRight && bothFromLeft <= pincer) {
            return bothFromLeft;
        } 
        else if (bothFromRight <= bothFromLeft && bothFromRight <= pincer) {
            return bothFromRight;
        } 
        else {
            return pincer;
        }
    }
}