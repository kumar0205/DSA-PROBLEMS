// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         Map<String ,List<Integer>> hm=new HashMap<>();
//         int n=strs.length;
//         for(int i=0;i<n;i++){
//             char [] lex=strs[i].toCharArray();
//             Arrays.sort(lex);
//             String sorted = new String(lex);
//             if(!hm.containsKey(sorted)) hm.put(sorted,new ArrayList<>());
//             hm.get(sorted).add(i);
//         }
//         List<List<String>> ans=new ArrayList<>();
//         for(List<Integer> valueList : hm.values()){
//             List<String> sub = new ArrayList<>();
//             for (Integer number : valueList) {
//                 sub.add(strs[number]);
//             }
//             ans.add(sub);
//         }
//         return ans;
//     }
// }
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // You can map directly to List<String> instead of indices to save a lookup step!
        Map<String, List<String>> hm = new HashMap<>();
        
        for (String s : strs) {
            char[] lex = s.toCharArray();
            Arrays.sort(lex);
            String sorted = new String(lex);
            
            // Modern one-liner to add the original string to its anagram group
            hm.computeIfAbsent(sorted, k -> new ArrayList<>()).add(s);
        }
        
        // Directly convert all the gathered lists (values) into the final result list
        return new ArrayList<>(hm.values());
    }
}
