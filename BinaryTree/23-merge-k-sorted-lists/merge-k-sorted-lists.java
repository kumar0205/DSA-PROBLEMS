import java.util.PriorityQueue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // Edge Case 1: Handle null or completely empty array safely
        if (lists == null || lists.length == 0) {
            return null;
        }

        // Optimization: Use Integer.compare to prevent arithmetic overflow bugs
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        
        ListNode ans = new ListNode();
        ListNode d = ans;
        
        // Add the head of each non-empty linked list into the priority queue
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                pq.add(lists[i]);
            }
        }
      
        // Process the min-heap
        while (!pq.isEmpty()) {
            ListNode t = pq.poll();
            d.next = t;
            d = t;
            
            // If the extracted node has a next element, add it back to the heap
            if (t.next != null) {
                pq.add(t.next);
            }
        }
        
        // Disconnect the tail node from any remaining dangling pointers
        d.next = null;
        
        return ans.next;
    }
}
