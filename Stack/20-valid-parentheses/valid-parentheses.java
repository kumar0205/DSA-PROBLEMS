class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        if (s.length() % 2 != 0) return false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push('(');
            }
            else if(c==')'){
                if(!st.isEmpty() && st.peek()=='(') st.pop();
                else{
                    st.push(')');
                    break;
                }
            }   
            if(c=='{'){
                st.push('{');
            }
            else if(c=='}'){
                if(!st.isEmpty() && st.peek()=='{') st.pop();
                else{
                    st.push(')');
                    break;
                }
            }
            if(c=='['){
                st.push('[');
            }
            else if(c==']'){
                if(!st.isEmpty() && st.peek()=='[') st.pop();
                else{
                    st.push(')');
                    break;
                }
            }
        }
         return (st.isEmpty());
    }
}