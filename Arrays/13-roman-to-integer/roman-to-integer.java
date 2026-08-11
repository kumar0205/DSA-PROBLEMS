class Solution {
    public int romanToInt(String s) {
        // Use a padding character to safely check the previous character
        s = "E" + s; 
        int i = s.length() - 1;
        int total = 0;
        
        while (i > 0) {
            char c = s.charAt(i);
            char bc = s.charAt(i - 1);
            
            // Fixed: Changed double quotes "" to single quotes ''
            if (c == 'V') {
                if (bc == 'I') { total += 4; i -= 2; }
                else { total += 5; i -= 1; }
            } else if (c == 'X') {
                if (bc == 'I') { total += 9; i -= 2; }
                else { total += 10; i -= 1; }
            } else if (c == 'L') {
                if (bc == 'X') { total += 40; i -= 2; }
                else { total += 50; i -= 1; }
            } else if (c == 'C') {
                if (bc == 'X') { total += 90; i -= 2; }
                else { total += 100; i -= 1; }
            } else if (c == 'D') {
                if (bc == 'C') { total += 400; i -= 2; }
                else { total += 500; i -= 1; }
            } else if (c == 'M') {
                if (bc == 'C') { total += 900; i -= 2; }
                else { total += 1000; i -= 1; }
            } else if (c == 'I') {
                total += 1;
                i -= 1;
            } else {
                // Fixed: Skip unrecognized characters instead of breaking the loop
                i--; 
            }
        }
        return total;
    }
}
