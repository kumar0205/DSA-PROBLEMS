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
        ListNode slow = head;
        ListNode fast = head;
        int c = 0;
        // while(temp!=null){
        //     c++;
        //     temp = temp.next;
        // }
        // int mid = c/2;
        // temp=head;
        // for(int i=0;i<mid;i++){
        //     temp = temp.next;
        // }
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast = fast.next.next;
        }
        //slow points to middle element eg =2;
        ListNode prev = null;
        ListNode curr = slow;
        ListNode next= null;
        while(curr!=null){
            next = curr.next;
            curr.next= prev;
            prev = curr;
            curr=next;
        }
        //5->4->2<-1 && null<-2<-1 
        ListNode tail=prev;
        int sum=0;
        while(tail!=null){
            sum=Math.max(head.val+tail.val,sum);
            head=head.next;
            tail=tail.next;
            
        }
        return sum;
    }
}