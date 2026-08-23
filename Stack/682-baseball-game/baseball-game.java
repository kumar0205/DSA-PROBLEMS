class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> st = new ArrayDeque<>();
        int ans=0;
        for(String c:operations){
            if(c.equals("C")){
               ans-=st.pop();
            }
            else if(c.equals("D")){
                st.push(st.peek()*2);
                ans+=st.peek();
            }
            else if(c.equals("+")){
                int poped=st.pop();
                ans+=st.peek()+poped;
                int add = st.peek()+poped;
                st.push(poped);
                st.push(add);
            }
            else{
                int num=Integer.parseInt(c);
                st.push(num);
                ans+=st.peek();
            }
        }
        return ans;
    }
}