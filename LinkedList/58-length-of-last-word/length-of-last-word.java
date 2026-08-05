class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int n= s.length(),count=0;
        for(int i = n-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                return count;
            }
            else{
                count++;
            }
        }
        return count;
    }
}