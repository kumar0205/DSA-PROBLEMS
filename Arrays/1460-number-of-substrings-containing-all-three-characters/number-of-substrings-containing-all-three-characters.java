class Solution {
    public int numberOfSubstrings(String s) {
        int l = 0, r = 0, n = s.length(), c = 0;
        // Array to store counts of 'a', 'b', and 'c'
        int[] counts = new int[3]; 
        // Tracks how many unique characters are in our window
        int uniqueCount = 0; 

        while (r < n) {
            int rightCharIdx = s.charAt(r) - 'a';
            if (counts[rightCharIdx] == 0) {
                uniqueCount++;
            }
            counts[rightCharIdx]++;

            while (uniqueCount == 3) {
                c += (n - r);

                int leftCharIdx = s.charAt(l) - 'a';
                counts[leftCharIdx]--;
                if (counts[leftCharIdx] == 0) {
                    uniqueCount--;
                }
                l++;
            }
            r++;
        }
        return c;
    }
}


// class Solution {
//     public int numberOfSubstrings(String s) {
//         int l=0,r=0,n=s.length()-1,c=0;
//         HashMap<Character,Integer> hm = new HashMap<>();
//         while(r<n){
//             hm.put(s.charAt(r),hm.getOrDefault(s.charAt(r),0)+1);
//             while(hm.size()==3){
//                 c+=(n-r)+1;
//                 hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
//                 if(hm.get(s.charAt(l))==0) hm.remove(s.charAt(l));
//                 l++;
//             }
//             r++;
//         }
//         return c;
//     }
// }