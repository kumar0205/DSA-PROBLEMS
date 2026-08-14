// class Solution {
//     public int countGoodSubstrings(String s) {
//         int r=2,c=0;
//         // if(s.charAt(0)==s.charAt(1)){
//         //     r=3;
//         //     // l=1;
//         // }
//         while(r<s.length()){
//             if(s.charAt(r)!=s.charAt(r-1) && s.charAt(r-1)!=s.charAt(r-2) && s.charAt(r)!=s.charAt(r-2)){
//                      c++;
                
//             }
//             // l++;
//             r++;
//         }
//         return c;
//     }
// }
class Solution {
    public int countGoodSubstrings(String s) {

        char[] str = s.toCharArray();
        int count = 0;

        for (int i = 0; i < str.length - 2; i++) {

            if (str[i] != str[i + 1]
                    && str[i] != str[i + 2]
                    && str[i + 1] != str[i + 2]) {
                count++;
            }
        }

        return count;
    }
}