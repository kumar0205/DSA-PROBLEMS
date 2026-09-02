class Solution {
    public int firstUniqChar(String s) {
        // Queue<Character> q= new ArrayDeque<>();
        // HashMap<Character,Integer> hm  = new HashMap<>();
        int [] freq=new int[26];
        for(int i=0;i<s.length();i++){
            // if(!hm.containsKey(c)){
            //     hm.put(c,1);
            //     q.offer(c);
            // }
            freq[s.charAt(i)-'a']++;
            // else{
            //     hm.put(c,hm.get(c)+1);
            // }
        }
        // int ans=-1;
        for(int i=0;i<s.length();i++){
            // if(hm.get(ch)==1){
            //     ans=s.indexOf(ch);
            //     break;
            // }
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}