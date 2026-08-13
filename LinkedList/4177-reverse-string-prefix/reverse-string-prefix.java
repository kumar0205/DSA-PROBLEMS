class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder prefix = new StringBuilder();
        for(int i=k-1;i>=0;i--){
            prefix.append(s.charAt(i));
            
        }
        return prefix.append(s.substring(k,s.length())).toString();
    }
}