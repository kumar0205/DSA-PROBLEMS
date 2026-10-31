class Solution {
    int dp[];
    public int climbStairs(int n) {
        dp=new int[n+1];
        return h(n);
        
    }
    public int h(int n){
        if(n<=1) return 1;
        if(dp[n]!=0) return dp[n];
        return dp[n]=h(n-1)+h(n-2); 
    }
}