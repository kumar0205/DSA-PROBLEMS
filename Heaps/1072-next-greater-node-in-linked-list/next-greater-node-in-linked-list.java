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
    public int[] nextLargerNodes(ListNode head) {
        Deque<Integer> st = new ArrayDeque<>();
        ListNode temp = head;
        ListNode prev= null;
        ListNode next=null;
        int c=0;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
            c++;
        }
        int ans[] = new int[c];
        int i=c;
        while(prev!=null){
            i--;
            while(!st.isEmpty() && prev.val>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()) ans[i]=0;
            else ans[i] = st.peek();
            st.push(prev.val);
            prev=prev.next;
        }
        return ans;
    }
}