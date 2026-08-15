class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int zeros=0,ones=0,n=s.length(),c=0;
        for(int i =0;i<n;i++){
            zeros=0;
            ones=0;
            for(int j=i;j<n;j++){
                if(s.charAt(j)=='0') zeros++;
                else ones++;
                if(zeros<=k || ones<=k) c++;
                else break;
            }
        }
        return c;
    }
}