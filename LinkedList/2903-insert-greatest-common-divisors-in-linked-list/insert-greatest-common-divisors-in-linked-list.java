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
    public static int findGcd(int a,int b){
        if(b==0) return a;
        return findGcd(b,a%b);
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