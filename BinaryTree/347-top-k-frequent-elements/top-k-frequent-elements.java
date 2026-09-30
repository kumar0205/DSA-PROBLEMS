class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->a[1]-b[1]);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            pq.add(new int[]{entry.getKey(),entry.getValue()});
            if(pq.size()>k) pq.poll();
        }
        int ans[] = new int[k];
        int i=0;
        while(!pq.isEmpty()){
            ans[i++]=pq.poll()[0];
        }
        return ans;
       
    }
}