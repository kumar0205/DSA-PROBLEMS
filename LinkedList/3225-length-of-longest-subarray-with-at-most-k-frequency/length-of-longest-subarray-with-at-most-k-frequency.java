class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left=0,n=nums.length,max=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int r=0;r<n;r++){
            if(!hm.containsKey(nums[r])){
             hm.put(nums[r],1);
             max=Math.max(max,r-left+1);
            }
            else if(hm.get(nums[r])+1<=k){
                max=Math.max(max,r-left+1);
                int freq= hm.get(nums[r]);
                hm.put(nums[r],freq+1);
            }
            else{
                while(nums[left]!=nums[r]){
                    int freq= hm.get(nums[left]);
                    hm.put(nums[left],freq-1);
                    left++;
                }
                left++;
            }


        }
        return max;
    }
}