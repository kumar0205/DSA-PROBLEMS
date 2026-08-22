import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] finalPrices(int[] prices) {
        Deque<Integer> st = new ArrayDeque<>();
        int n = prices.length;
        int[] ans = new int[n];
        
        // Handle the last element safely
        st.push(prices[n-1]);
        ans[n-1] = prices[n-1];
        
        // Loop backwards from the second to last item
        for (int i = n - 2; i >= 0; i--) {
            // Pop elements that are bigger than current price 
            // because they cannot be a valid discount
            while (!st.isEmpty() && st.peek() > prices[i]) {
                st.pop();
            }
            
            // If the stack isn't empty, the top element is our discount
            if (!st.isEmpty()) {
                ans[i] = prices[i] - st.peek();
            } else {
                ans[i] = prices[i];
            }
            
            // CRITICAL FIX: Always push the current price onto the stack
            st.push(prices[i]);
        }
        
        return ans;
    }
}
