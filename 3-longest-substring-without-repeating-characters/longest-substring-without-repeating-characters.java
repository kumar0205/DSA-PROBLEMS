class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> hash = new HashMap<>();
        int n=s.length(),length=0;
        for (int i=0;i<n;i++){
            hash.clear();
            for(int j=i;j<n;j++){
                char c= s.charAt(j);
                if(hash.containsKey(c)){
                    
                    break;
                }
                else{
                    hash.put(c,1);
                    if((j-i+1)>length) length=j-i+1;
                }
            }
        }
        return length;
    }
}