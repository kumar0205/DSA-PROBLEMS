// class Solution {
//     public int[] nextGreaterElements(int[] nums) {
//         Deque <Integer>st = new ArrayDeque<>();
//         int n = nums.length;
//         int ans[] =new int[n];
//         // st.push(nums[n-1]);
//         for(int j=2*n-1;j>=0;j--){
//             int i = j%n;
//             while(!st.isEmpty() && nums[i]>=st.peek()){
//                 st.pop();
//             }
//             // ans[i]=st.peek();
//             // st.push(nums[i]);
//             if(!st.isEmpty() && nums[i]<st.peek()){
//                 ans[i]=st.peek();
//                 // st.push(nums[i]);
//             }
//             else {
//                 ans[i]=-1;
//                 // st.pop();
//             }
//             st.push(nums[i]);
//         }
//         return ans;
//     }
// }
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Deque<Integer> st = new ArrayDeque<>();
        int n = nums.length;
        int[] ans = new int[n];
        
        for (int j = 2 * n - 1; j >= 0; j--) {
            int i = j % n;
            
            // 1. Remove elements smaller than or equal to the current number
            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }
            
            // 2. The top of the stack is the next greater element
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            
            // 3. Push current number onto the stack for future comparisons
            st.push(nums[i]);
        }
        return ans;
    }
}