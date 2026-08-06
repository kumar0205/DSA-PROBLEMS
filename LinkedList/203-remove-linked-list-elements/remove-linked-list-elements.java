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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode temp=head;
        ListNode dummy= new ListNode(0);
        ListNode ans = dummy;
        while(temp!=null){
            if(temp.val == val){
                    temp = temp.next;
            }
           else {
                dummy.next= temp;
                dummy = dummy.next;
                temp=temp.next;
            }
        }
        dummy.next = null;
        return ans.next;

        
    }
}