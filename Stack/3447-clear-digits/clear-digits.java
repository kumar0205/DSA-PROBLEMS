class Solution {
    public String clearDigits(String s) {
        // Use StringBuilder as our stack for maximum speed
        StringBuilder st = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (Character.isDigit(ch)) {
                // Safe check: Only pop if there is a character to remove
                if (st.length() > 0) {
                    st.deleteCharAt(st.length() - 1); // Pops the last character
                }
            } else {
                st.append(ch); // Pushes the non-digit character
            }
        }
        
        // No need to reverse or loop backwards, it's already in the right order!
        return st.toString();
    }
}
