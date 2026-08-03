class Solution {
    public ListNode swapPairs(ListNode head) {
        // Base case: if list is empty or has only one node, no swaps needed
        if (head == null || head.next == null) return head;
        
        // Dummy node acts as a temporary anchor before the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        // Process pairs as long as there are at least two nodes left
        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = prev.next.next;
            
            // Reversing the pair pointers
            first.next = second.next;
            second.next = first;
            prev.next = second; // Connect previous pair to the new first node
            
            // Move the prev pointer two steps forward for the next iteration
            prev = first;
        }
        
        return dummy.next;
    }
}
