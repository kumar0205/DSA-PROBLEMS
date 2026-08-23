import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int minLength(String s) {
        // Use Deque/ArrayDeque for better performance than Stack
        Deque<Character> st = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            // FIX: Always ensure stack is NOT empty before calling peek()
            if (!st.isEmpty() && st.peek() == 'A' && current == 'B') {
                st.pop();
            } 
            else if (!st.isEmpty() && st.peek() == 'C' && current == 'D') {
                st.pop();
            } 
            else {
                st.push(current);
            }
        }
        
        return st.size();
    }
}
