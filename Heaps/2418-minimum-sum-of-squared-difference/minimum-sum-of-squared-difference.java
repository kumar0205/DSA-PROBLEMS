class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
       int diff[]=new int[nums1.length];
       int maxdiff=-9999;
       for(int i=0;i<nums1.length;i++){
        diff[i]=Math.abs(nums1[i]-nums2[i]);
        maxdiff=Math.max(maxdiff,diff[i]);
       };
       long count[]=new long[maxdiff+1];
       for(int i:diff){
        count[i]++;
       }
       long k = (long)k1+k2;
       for(int i=maxdiff;i>0;i--){
        if(count[i]==0) continue;
        else if(k>=count[i]){
            k-=count[i];
            count[i-1]+=count[i];
            count[i]=0;
        }
        else{
            count[i-1]+=k;
            count[i]-=k;
            break;
        }
       }
        long ans = 0;
        for (int d = 1; d <= maxdiff; d++) {
            if (count[d] > 0) {
                ans += count[d] * ((long) d * d);
            }
        }
        
        return ans;
    }
}