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
    public int getDecimalValue(ListNode head) {
        // if(head.val==1) return 1;
        // if(head.val ==0) return 0;
        ListNode temp = head;
        int c=0;
        while(temp !=null){
            temp = temp.next;
            c=c+1;
        }
        int ans=0;
        temp = head;
        while(temp!=null){
            ans +=(Math.pow(2,c-1)*temp.val);
            temp = temp.next;
            c--;
        }
        return ans;
    }
}