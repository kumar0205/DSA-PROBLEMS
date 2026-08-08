/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        // ListNode temp = head;
        // int c = 0;
        // while(temp!=null){
        //     temp = temp.next;
        //     c++;
        // }
        // temp = head;
        // int mid = c/2;
        // c=1;
        // while(c++<mid) temp = temp.next;
        // temp.next = temp.next.next;
        // return head;
        ListNode slow = head;
        ListNode fast = head.next.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}