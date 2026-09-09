class Solution {
    public long countCommas(long n) {
        long p = 1000,res=0;
          if(n <= 999) return 0;
        while(p<=n){
            res+=n-p+1;
            p*=1000;
        }
        return res;
    }
}