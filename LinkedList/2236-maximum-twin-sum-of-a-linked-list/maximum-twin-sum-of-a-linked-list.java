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
    public int pairSum(ListNode head) {
        ListNode temp = head;
        int c = 0;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        int mid = c/2;
        temp=head;
        for(int i=0;i<mid;i++){
            temp = temp.next;
        }
        ListNode prev = null;
        ListNode curr = temp;
        ListNode next= null;
        while(curr!=null){
            next = curr.next;
            curr.next= prev;
            prev = curr;
            curr=next;
        }
        ListNode tail=prev;
        temp = head;
        int sum=0;
        for(int i=0;i<mid;i++){
            sum=Math.max(head.val+tail.val,sum);
            head=head.next;
            tail=tail.next;
            
        }
        return sum;
    }
}