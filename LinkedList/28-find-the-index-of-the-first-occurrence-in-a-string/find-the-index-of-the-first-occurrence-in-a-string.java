class Solution {
    public int strStr(String haystack, String needle) {
        int ni=0;
        for(int i=0;i<haystack.length();i++){
            if(needle.charAt(ni)==haystack.charAt(i)){
                ni++;
                if(ni==needle.length()) return i-ni+1;
            }
            else if(ni>0){
             i = i-ni;
             ni=0;
            }
            else ni=0;
        }
        return -1;
    }
}