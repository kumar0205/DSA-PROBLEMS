class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        HashMap<Character,Integer> charSet = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            if(charSet.containsKey(s.charAt(right)) && charSet.get(s.charAt(right))>=left) {
                left=charSet.get(s.charAt(right))+1;
                // charSet.put(s.charAt(right),right);
            }

            charSet.put(s.charAt(right),right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;       
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