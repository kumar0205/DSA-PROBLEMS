class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:piles) pq.add(i);
        int ans=0;
        for(int i=1;i<=k;i++){
            int top = pq.poll();
            int div=top/2;
            pq.add(top-div);
        }
        while(!pq.isEmpty()) ans+=pq.poll();
        return ans;

    }
}