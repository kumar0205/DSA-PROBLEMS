class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        if (k == 0) return head;
        
        ListNode temp = head;
        int c = 0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        
        // FIX 1: Simplify logic. Any rotation greater than size 'c' wraps around.
        k = k % c;
        if (k == 0) return head; 
        
        ListNode prev = null;
        ListNode ans = null;
        temp = head;
        int i = 0;
        
        while (temp != null) {
            // FIX 2: Correct index matching logic to find the cutting point safely.
            if ((k + i) % c == 0 && prev != null) {
                prev.next = null;
                ans = temp;
            }
            i++; // Increment properly after the conditional check
            prev = temp;
            temp = temp.next;
            
            if (temp == null) {
                prev.next = head;
                break;
            }
        }
        return ans;
    }
}
