class Solution {
    public int minSetSize(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->Integer.compare(b,a));
        HashMap<Integer,Integer> hm = new HashMap();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        hm.forEach((key, value) -> {
            pq.add(value);
        });
        int c=0,sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll();
            c++;
            if(sum>=arr.length/2) return c;
        }
        return c;
    }
}