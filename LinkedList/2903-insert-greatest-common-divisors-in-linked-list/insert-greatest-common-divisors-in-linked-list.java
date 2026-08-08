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
      private int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr= head;
        ListNode next = head.next;
        while(next!=null){
            ListNode newNode= new ListNode(findGcd(curr.val,next.val));
            curr.next=newNode;
            newNode.next=next;
            curr=next;
            // if(next.next==null) break;
            next=next.next;
        }
        return head;
    }
}