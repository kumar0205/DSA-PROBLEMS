class Solution {
    public int firstUniqChar(String s) {
        Queue<Character> q= new ArrayDeque<>();
        HashMap<Character,Integer> hm  = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(!hm.containsKey(c)){
                hm.put(c,1);
                q.offer(c);
            }
            else{
                hm.put(c,hm.get(c)+1);
            }
        }
        int ans=-1;
        for(char ch :q){
            if(hm.get(ch)==1){
                ans=s.indexOf(ch);
                break;
            }
        }
        return ans;
    }
}