class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));
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