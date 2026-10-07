class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> hm =new HashMap();
        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->{
            int fa=hm.get(a);
            int fb=hm.get(b);
            if(fa==fb) return b.compareTo(a);
            return Integer.compare(fa,fb);
        });
        for(int i=0;i<words.length;i++){
            hm.put(words[i],hm.getOrDefault(words[i],0)+1);
        }
        for (String word : hm.keySet()) {
            pq.add(word);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<String> ans = new ArrayList<>();
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        Collections.reverse(ans);
        return ans;
    }
}