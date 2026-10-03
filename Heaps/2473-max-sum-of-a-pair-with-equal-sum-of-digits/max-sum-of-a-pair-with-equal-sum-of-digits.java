import java.util.PriorityQueue;

class Solution {
    public int maximumSum(int[] nums) {
        // Sort by digit sum descending. If digit sums are equal, sort by actual number value descending.
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (b[0] != a[0]) {
                return Integer.compare(b[0], a[0]);
            }
            return Integer.compare(nums[b[1]], nums[a[1]]);
        });
        
        // 1. Calculate digit sums and add to PQ
        for (int i = 0; i < nums.length; i++) {
            int i1 = nums[i];
            int sum = 0;
            while (i1 > 0) {
                sum += i1 % 10;
                i1 /= 10;
            }
            pq.add(new int[]{sum, i});
        }
        
        int maxPairSum = -1;
        
        // 2. Process the queue
        while (pq.size() > 1) {
            int[] x = pq.poll();
            int[] y = pq.peek(); // Look at the next element without removing it
            
            if (x[0] == y[0]) {
                // If they have the same digit sum, check their combined value
                maxPairSum = Math.max(maxPairSum, nums[x[1]] + nums[y[1]]);
            }
            // Note: We only poll 'x', so 'y' naturally becomes the new 'x' in the next iteration.
            // This safely checks pairs like (Element1, Element2), then (Element2, Element3).
        }
        
        return maxPairSum;
    }
}
