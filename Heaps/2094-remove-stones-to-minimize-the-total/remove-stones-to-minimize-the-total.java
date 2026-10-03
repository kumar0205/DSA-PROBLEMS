// class Solution {
//     public int minStoneSum(int[] piles, int k) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//         for(int i:piles) pq.add(i);
//         int ans=0;
//         for(int i=1;i<=k;i++){
//             int top = pq.poll();
//             int div=top/2;
//             pq.add(top-div);
//         }
//         while(!pq.isEmpty()) ans+=pq.poll();
//         return ans;

//     }
// }\
import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int minStoneSum(int[] piles, int k) {
        // Create a Max-Heap to keep track of the largest pile at the top
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        int totalStones = 0;
        for (int pile : piles) {
            pq.add(pile);
            totalStones += pile; // Track the total sum to make deduction efficient
        }
        
        // Perform the k operations
        for (int i = 0; i < k; i++) {
            int largestPile = pq.poll();
            
            // Calculate how many stones to remove using floor division
            int removed = largestPile / 2; 
            
            // Update total sum and put the remainder back into the heap
            totalStones -= removed;
            pq.add(largestPile - removed);
        }
        
        return totalStones;
    }
}
