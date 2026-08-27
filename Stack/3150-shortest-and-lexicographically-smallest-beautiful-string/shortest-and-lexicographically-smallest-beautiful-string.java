class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int l = 0, r = 0, n = s.length();
        int c = 0; 
        String ans = ""; 

        while (r < n) {
            if (s.charAt(r) == '1') {
                c++;
            }
            
            // Fix: Trim extra 1s AND leading 0s when we already have k ones
            while (c > k || (c == k && s.charAt(l) == '0')) {
                if (s.charAt(l) == '1') {
                    c--;
                }
                l++;
            }
            
            if (c == k) {
                String current = s.substring(l, r + 1);
                
                // Fix: Correct string length and lexicographical comparison
                if (ans.equals("")) {
                    ans = current;
                } else if (current.length() < ans.length()) {
                    ans = current;
                } else if (current.length() == ans.length() && current.compareTo(ans) < 0) {
                    ans = current;
                }
            }
            r++;
        }
        return ans;
    }
}