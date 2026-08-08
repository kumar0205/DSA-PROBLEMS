class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode temp = head;
        int c = 0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        
        // BUG 1 FIXED: Restructured loop boundaries to avoid cycles
        int mid = c / 2; 
        temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }
        
        // BUG 2 FIXED: Start 'prev' as null so the reversed tail points to null
        ListNode prev = null; 
        ListNode curr = temp;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        ListNode tail = prev;
        // BUG 3 FIXED: Use 'tail != null' for safe comparison without counting errors
        while (tail != null) { 
            if (head.val != tail.val) return false;
            head = head.next;
            tail = tail.next;
        }
        return true;
    }
}
