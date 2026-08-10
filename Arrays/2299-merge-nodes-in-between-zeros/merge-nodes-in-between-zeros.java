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
        ListNode temp1 = head;
        ListNode temp = head.next;
        // ListNode dummy = new ListNode(0);
        while(temp!=null){
            if(temp.val!=0) cursum+=temp.val;
            else{
                temp1.val =cursum;
                if(temp.next==null) break;
                temp1 = temp1.next;
                cursum=0;
            } 
            temp = temp.next;
        }
        temp1.next=null;
        return head;
    }
}