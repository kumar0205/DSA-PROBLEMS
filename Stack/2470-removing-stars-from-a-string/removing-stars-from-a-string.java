class Solution {
    public String removeStars(String s) {
        // Deque<Character> st = new ArrayDeque<>();
        StringBuilder st = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='*'){
                st.deleteCharAt(st.length()-1);
            }
            else st.append(c);
        }
        return st.toString();
    }
}