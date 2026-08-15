class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Size 128 covers all standard characters safely
        int[] freq = new int[128];
        int n = s.length(), length = 0, l = 0, r = 0;
        
        while (r < n) {
            char c = s.charAt(r);
            freq[c]++; // hash.put(c, hash.getOrDefault(c,0)+1)
            while(freq[c]>1){
                char l1 = s.charAt(l);
                freq[l1]=freq[l1]-1;
                l++;
            }
            length = Math.max(length,r-l+1);
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