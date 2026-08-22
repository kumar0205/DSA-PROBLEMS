class Solution {
    public boolean checkDivisibility(int n) {
        int n1=n,sum=0,prod=1;
        while(n1!=0){
            int digit=n1%10;
            sum=sum+digit;
            prod=prod*digit;
            n1=n1/10;
        }
        if((n%(sum+prod))==0) return true;
        return false;
    }
}