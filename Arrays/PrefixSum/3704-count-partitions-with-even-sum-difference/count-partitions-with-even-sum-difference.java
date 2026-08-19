class Solution {
    public int countPartitions(int[] nums) {
        int n =nums.length,c=0;
        int [] ps= new int [n];
        ps[0]=nums[0];
        for(int i=1;i<n;i++){
            ps[i]=nums[i]+ps[i-1];
        }
        // for(int i=0;i<n;i++){
        //     int diff = ps[i]-(ps[n-1]-ps[i]);
        //     if(Math.abs(diff)%2==0) c++;
        // }
        if(ps[n-1]%2==0) return n-1;
        return 0;

    }
}