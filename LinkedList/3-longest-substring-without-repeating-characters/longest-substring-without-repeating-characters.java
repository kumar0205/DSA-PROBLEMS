class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Size 128 covers all standard characters safely
        int[] freq = new int[128];
        int n = s.length(), length = 0, l = 0, r = 0;
        
        while (r < n) {
            char c = s.charAt(r);
            freq[c] = freq[c] + 1; // hash.put(c, hash.getOrDefault(c,0)+1)
            
            if (freq[c] == 1) { // hash.get(c)==1
                length = Math.max(length, r - l + 1);
            }
            else {
                while (s.charAt(l) != c) {
                    freq[s.charAt(l)] = freq[s.charAt(l)] - 1; // hash.put(..., hash.get(...)-1)
                    // Note: Array elements automatically stay at 0, no remove() needed
                    l++;
                }
                freq[s.charAt(l)] = freq[s.charAt(l)] - 1; // hash.put(..., hash.get(...)-1)
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