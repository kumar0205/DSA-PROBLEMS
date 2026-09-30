class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < matrix.length; i++) {
            pq.add(new int[] { matrix[i][0], i, 0 });
        }
        int ans=0,c=0;
        int lev = 0, ind = 0, i = 0;
        while (!pq.isEmpty()) {
            int[] t = pq.poll();
            lev = t[1];
            ind = t[2];
            if(++c==k){
              ans=t[0];
              break;  
            } 
            ind++;
            if (ind < matrix[lev].length) {
                pq.add(new int[] { matrix[lev][ind], lev, ind });
            }
        }
        return ans;
    }
}