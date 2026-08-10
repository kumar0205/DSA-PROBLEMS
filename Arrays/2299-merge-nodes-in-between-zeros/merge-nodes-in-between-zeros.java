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
    public ListNode mergeNodes(ListNode head) {
        int cursum=0;
        ListNode temp = head.next;
        ListNode dummy = new ListNode(0);
        ListNode temp1 = dummy;
        while(temp!=null){
            if(temp.val!=0) cursum+=temp.val;
            else{
                dummy.next = new ListNode(cursum);
                dummy = dummy.next;
                cursum=0;
            } 
            temp = temp.next;
        }
        return temp1.next;
    }
}