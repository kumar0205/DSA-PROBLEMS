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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode tail2 = list2;
        while(tail2.next!=null){
            tail2=tail2.next;
        }
        // ListNode temp = list1;
        ListNode start=list1;;
        // for(int i =0;i<=b+1;i++){
        //     if(i==a-1) start = temp ;
        //     if(i==b+1) end=temp;
        //     temp= temp.next;
        // }
        for(int i = 0;i<a-1;i++) start=start.next;
        ListNode end= start.next;
        for(int i=a;i<b+1;i++) end= end.next;

        start.next = list2;
        tail2.next=end;
        return list1;
    }
}