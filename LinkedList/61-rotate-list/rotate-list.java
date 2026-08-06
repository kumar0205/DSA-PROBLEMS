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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null ) return head;
        if(k == 0) return head;
        ListNode temp = head;
        int c= 0;
        while(temp!=null) {
            c++;
            temp = temp.next;
        }
        if(c<=k){
            if(k%c == 0 || c%k == 0 ) return head;
        }
        ListNode prev = null;
        ListNode ans = null;
        temp = head;
        int i =0;
        while(temp!=null){
            if((k+i++)%c == 0){
                prev.next=null;
                ans =temp;
            }
            prev = temp;
            temp = temp.next;
            if(temp == null ) {
                prev.next =head;
                break;
            }
        }
        return ans;
    }
}