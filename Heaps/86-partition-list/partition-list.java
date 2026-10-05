class Solution {
    public ListNode partition(ListNode head, int x) {
        // Create dummy heads. They are objects, so they are never null!
        ListNode lns = new ListNode(0);
        ListNode ln = lns;
        ListNode gns = new ListNode(0);
        ListNode gn = gns;
        
        ListNode temp = head;
        while (temp != null) {
            if (temp.val < x) {
                ln.next = temp;   // Append to the "less than" list
                ln = ln.next;     // Move the pointer forward
            } else {
                gn.next = temp;   // Append to the "greater/equal" list
                gn = gn.next;     // Move the pointer forward
            }
            temp = temp.next;     // Advance through the original list
        }
        
        // CRUCIAL: Cut off any leftover links to prevent an infinite cycle loop
        gn.next = null;
        
        // Connect the "less than" list to the start of the "greater/equal" list
        ln.next = gns.next;
        
        // Return the actual head skipping the dummy node
        return lns.next;
    }
}
