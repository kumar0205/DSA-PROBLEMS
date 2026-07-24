import java.util.*;

class Solution {
    public String frequencySort(String s) {
       Map<Character,Integer> hash=new HashMap<>();
       for(int i=0;i<s.length();i++){
            char key=s.charAt(i);
            hash.put(key,hash.getOrDefault(key,0)+1);
       }
       List<Character>[] bucket = new List[s.length()+1];
       for(char key : hash.keySet()){
            int freq=hash.get(key);
            if(bucket[freq]==null) bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
       }
       StringBuilder ans = new StringBuilder();
       for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(char key : bucket[i]){
                    ans.append(String.valueOf(key).repeat(i));
                }
            }
       }
       return ans.toString();
    }
}