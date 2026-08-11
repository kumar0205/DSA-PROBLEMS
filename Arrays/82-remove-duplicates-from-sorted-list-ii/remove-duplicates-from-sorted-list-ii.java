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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode temp=dummy;
        ListNode cur = head;
        ListNode next = head.next;
        int skipel = -111;
        while(cur!=null && next!=null){
            if(cur.val == next.val){
                skipel = cur.val;
                // cur = cur.next.next;
            }
            else{
                if(skipel != cur.val){
                    dummy.next=cur;
                    dummy= cur;
                }
                
            }
            cur= cur.next;
            // if(cur==null) break;
            next=cur.next;
        }
        if(skipel != cur.val){
                    dummy.next=cur;
                    dummy= cur;
                }
        dummy.next=null;

        return temp.next;
    }
}