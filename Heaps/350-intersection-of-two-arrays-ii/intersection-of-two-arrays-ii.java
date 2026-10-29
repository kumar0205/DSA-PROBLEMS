class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ;i<nums1.length;i++){
            hm.put(nums1[i],hm.getOrDefault(nums1[i],0)+1);
        }
        int ind=0;
        int [] ans = new int[Math.max(nums1.length,nums2.length)];
        for(int i=0;i<nums2.length;i++){
            if(hm.containsKey(nums2[i])){
                hm.put(nums2[i],hm.get(nums2[i])-1);
                ans[ind++]=nums2[i];
                if(hm.get(nums2[i])==0) hm.remove(nums2[i]);

            }
        }
        return Arrays.copyOf(ans, ind);
    }
}