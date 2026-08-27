class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int opened = 0; // This integer acts as our virtual stack
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                // If opened > 0, it means this is an INNER parenthesis
                if (opened > 0) ans.append(c);
                opened++; 
            } else {
                // It's a closing parenthesis. Decrement first.
                opened--;
                // If opened > 0, it means it's not the OUTERMOST closing parenthesis
                if (opened > 0) ans.append(c);
            }
        }
        return ans.toString();
    }
}