class Solution {
    public int countGoodSubstrings(String s) {
        int r=2,c=0;
        // if(s.charAt(0)==s.charAt(1)){
        //     r=3;
        //     // l=1;
        // }
        while(r<s.length()){
            if(s.charAt(r)!=s.charAt(r-1) && s.charAt(r-1)!=s.charAt(r-2) && s.charAt(r)!=s.charAt(r-2)){
                     c++;
                
            }
            // l++;
            r++;
        }
        return c;
    }
}