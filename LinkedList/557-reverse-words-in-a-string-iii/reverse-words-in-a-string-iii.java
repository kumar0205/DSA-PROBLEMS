// class Solution {
//     public String reverseWords(String s) {
//         String ans[] = s.split(" ");
//         s="";
//         for(int i=0;i<ans.length;i++){
//             ans[i] = new StringBuilder(ans[i]).reverse().toString();
//             s=s+ans[i]+" ";
//         }
//         return s.trim();
//     }
// }
public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+"); 
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse(); 
            reversed.append(reversedWord).append(" "); 
        }
        return reversed.toString().trim();
    }
}