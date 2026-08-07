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
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        int c = 0;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        int mid = c/2+1;
        temp = head;
        for(int i = 1 ;i<mid;i++){
            temp = temp.next;
        }
        return temp;

    }
}