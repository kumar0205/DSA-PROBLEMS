class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        PriorityQueue<Character> pq= new PriorityQueue<>((a,b)->{
            int fa=hm.get(a);
            int fb=hm.get(b);
            return Integer.compare(fb,fa);

        });
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
            if(hm.get(c)>(s.length()+1)/2) return "";
        }
        for(char c:hm.keySet()){
            pq.add(c);
            
        }
        Character ls=null;
        StringBuilder ans= new StringBuilder();
            while(!pq.isEmpty()){
            char poped = pq.poll();
            ans.append(poped);
            hm.put(poped,hm.get(poped)-1);
            if(ls!=null && hm.get(ls)>0) pq.add(ls);
            ls=poped;
        }
        return ans.toString();
    }
}