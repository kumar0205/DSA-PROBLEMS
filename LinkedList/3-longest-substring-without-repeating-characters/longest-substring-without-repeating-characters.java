class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> hash = new HashMap<>();
        int n=s.length(),length=0,l=0,r=0;
        while(r<n){
            char c = s.charAt(r);
            hash.put(c,hash.getOrDefault(c,0)+1);
            if(hash.get(c)==1){
                length = Math.max(length,r-l+1);
            }
            else{
                while(s.charAt(l)!=c){
                    hash.put(s.charAt(l),hash.get(s.charAt(l))-1);
                    if (hash.get(s.charAt(l)) == 0) {
                        hash.remove(s.charAt(l));
                    }
                    l++;
                }
                hash.put(s.charAt(l),hash.get(s.charAt(l))-1);
                if (hash.get(s.charAt(l)) == 0) {
                        hash.remove(s.charAt(l));
                    }
                l++;
            }
            r++;
        }
        return length;
    }
}







// for (int i=0;i<n;i++){
//              hash.clear();
//             for(int j=0;j<n;j++){
//                 char c= s.charAt(j);
//                 if(hash.containsKey(c)){
//                     break;
                    
//                 }
//                 else{
//                     hash.put(c,1);
//                     if((j-i+1)>length) length=j-i+1;
//                 }
//             }
//         }