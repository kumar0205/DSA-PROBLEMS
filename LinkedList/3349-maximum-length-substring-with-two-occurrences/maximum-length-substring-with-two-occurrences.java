class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int l=0,maxlen=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
            if(hm.get(c)>2){
                while(hm.get(c)>2){
                    hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                    l++;
                }
            }
            maxlen=Math.max(maxlen,i-l+1);
        }
        return maxlen;
    }
}