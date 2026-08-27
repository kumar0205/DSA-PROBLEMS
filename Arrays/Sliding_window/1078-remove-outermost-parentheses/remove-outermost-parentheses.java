class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans= new StringBuilder();
        // Deque<Character> st = new ArrayDeque<>(); 
        int co=0;
         for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                co++;
                if(co>1) ans.append(c);
            }
            else{
                if(co>1){
                    co--;
                    ans.append(c);
                }
                else if(co==1) co--;
            }
         }
         return ans.toString();
    }
}