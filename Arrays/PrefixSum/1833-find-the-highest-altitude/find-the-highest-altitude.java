class Solution {
    public int largestAltitude(int[] gain) {
        int gain1 =0,ans=0,n=gain.length;
        ans=0;
        for(int i=0;i<n;i++){
            gain1+=gain[i];
            ans = Math.max(ans,gain1);
        }
        return ans;
    }
}