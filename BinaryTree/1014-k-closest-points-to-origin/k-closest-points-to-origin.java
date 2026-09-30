class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq= new PriorityQueue<>((a, b) -> Integer.compare(
    b[0] * b[0] + b[1] * b[1],
    a[0] * a[0] + a[1] * a[1]
));
        for(int i=0;i<points.length;i++){
            pq.add(points[i]);
            if(pq.size()>k) pq.poll();
        }
        int ans[][] =new int[k][2];
        int i=0;
        while(!pq.isEmpty()){
            // int p[]= pq.poll();
            // ans[i][0]=p[0];
            // ans[i][1]=p[1];
            // i++;
            ans[i++]=pq.poll();
        }
        return ans;
    }
}