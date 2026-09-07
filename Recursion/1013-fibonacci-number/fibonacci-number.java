class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return fib1(n,0,1);
    }
    public int fib1(int n,int a,int b){
        // if(n==0) return 0;
        if(n==1) return b;
        return fib1(n-1,b,a+b);
    }
}