class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int []freq=new int[26];
        int l=0,maxlen=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            // hm.put(c,hm.getOrDefault(c,0)+1);
            freq[c-'a']++;
            // if(hm.get(c)>2){
            // if(freq[c-'a']>2){
                while(freq[c-'a']>2){
                    // hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                    freq[s.charAt(l)-'a']--;
                    l++;
                }
            // }
            maxlen=Math.max(maxlen,i-l+1);
        }
        return maxlen;
    }
}