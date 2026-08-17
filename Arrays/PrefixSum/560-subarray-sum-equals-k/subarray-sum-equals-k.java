class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length,sum=0,c=0,l=0,r=0;
        // for(int i=0;i<n;i++){
        //     sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=nums[j];
        //         if(sum==k) c++;
        //         //if(sum>k) break;
        //     }
        // }
        // while(sum<k) sum+=nums[r++];
        // while(r<n){
        //     sum+=nums[r];
        //     if(sum==k) break;
        //     r++
        // }
        // c++;
        // while(r<n){
        //     sum+=nums[r];
        //     while(sum>k)
        //     {
        //             sum-=nums[l];
        //             l++;
        //     }
        //     if(sum==k) c++;
            
        //     r++;
        // }
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        // for(int i=1;i<n;i++){
        //     nums[i]+=nums[i-1];
        // }
        while(r<n){
            sum+=nums[r];
            if(hm.containsKey(sum-k)){
                c+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
            r++;
        }
        return c;
    }
}