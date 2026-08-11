class Solution {
    public int myAtoi(String s) {
        // 1. Handle empty string
        if (s == null || s.isEmpty()) return 0;
        
        s = s.trim(); // Remove leading/trailing spaces
        if (s.isEmpty()) return 0;

        int sign = 1;
        int index = 0;
        long result = 0; // Use long to easily detect overflow

        // 2. Check for sign
        char firstChar = s.charAt(0);
        if (firstChar == '-') {
            sign = -1;
            index++;
        } else if (firstChar == '+') {
            index++;
        }

        // 3. Convert digits and prevent overflow
        while (index < s.length()) {
            char c = s.charAt(index);
            
            // Break immediately if a non-digit character is found
            if (c < '0' || c > '9') {
                break;
            }

            // Append digit mathematically
            result = result * 10 + (c - '0');

            // 4. Handle 32-bit signed integer overflow bounds
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            index++;
        }

        return (int) (result * sign);
    }
}
