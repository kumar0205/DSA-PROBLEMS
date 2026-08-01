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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        HashSet<Integer> hs = new HashSet<>();
        hs.add(head.val);
        ListNode prev= head;
        ListNode temp = head.next;
        while(temp!=null){
            int val = temp.val;
            if(!hs.contains(val)){
                prev.next = temp;
                hs.add(val);
                prev = temp;
            }
            temp = temp.next;

        }
        prev.next= null;
        return head;
    }
}