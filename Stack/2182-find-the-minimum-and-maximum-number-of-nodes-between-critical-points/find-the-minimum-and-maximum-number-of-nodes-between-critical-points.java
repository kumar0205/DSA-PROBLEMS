// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public int[] nodesBetweenCriticalPoints(ListNode head) {
//         ListNode temp = head.next;
//         ListNode prev= head;
//         boolean valid=false;
//         int c=1,minfirstele=-1,maxfirstele=-1,min=Integer.MAX_VALUE,max=-1;
//         int [] ans=new int[2];
//         while(temp.next!=null){
//             c++;
//             if(temp.val>prev.val && temp.val>temp.next.val){
//                 valid=true;
//             }
//             if(temp.val<prev.val && temp.val<temp.next.val){
//                 valid=true;
//             }
//             // min=Integer.MAX_VALUE;
//             // int max=-1;
//             if(valid){
//                 if(minfirstele<0){
//                     maxfirstele=c;
//                 }
//                 else{
//                 // max=c-maxfirstele;
//                 min=Math.min(c-minfirstele,min);
//                 }
//                 minfirstele=c;
//             }
//             valid=false;
//             prev = temp;
//             temp=temp.next;
//         }
//         if(min==Integer.MAX_VALUE){
//             ans[0]=-1;
//             ans[1]=-1;
//         }
//         else {
//             ans[0]=min;
//             ans[1]=max;
//         }
//         return ans;
//     }
// }
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode temp = head.next;
        
        int c = 1; 
        int firstCrit = -1;
        int prevCrit = -1;
        int min = Integer.MAX_VALUE;
        
        while (temp.next != null) {
            // Check for local minimum OR local maximum in one clean statement
            if ((temp.val > prev.val && temp.val > temp.next.val) || 
                (temp.val < prev.val && temp.val < temp.next.val)) {
                
                if (firstCrit == -1) {
                    firstCrit = c; // Mark the very first critical point
                } else {
                    // Min distance is strictly between adjacent critical points
                    min = Math.min(min, c - prevCrit);
                }
                prevCrit = c; // Update the previous critical point to current
            }
            
            // FIX: You forgot to move the 'prev' pointer forward!
            prev = temp;
            temp = temp.next;
            c++;
        }
        
        if (min == Integer.MAX_VALUE) {
            return new int[]{-1, -1};
        }
        
        // FIX: Max distance is ALWAYS the very last critical point minus the first
        return new int[]{min, prevCrit - firstCrit};
    }
}