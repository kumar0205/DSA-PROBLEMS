import java.util.PriorityQueue;

class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> emax = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        PriorityQueue<Integer> omax = new PriorityQueue<>((a, b) -> Integer.compare(b, a));   
        
        // Use an array to hold up to 10 digits (since max value fits in standard 32-bit int)
        int[] digits = new int[10];
        int count = 0;
        
        // 1. Extract digits from right to left
        while (num > 0) {
            int d = num % 10;
            digits[count++] = d; // Stores digits in reverse order
            if (d % 2 == 0) emax.add(d);
            else omax.add(d);
            num = num / 10;
        }
        
        int ans = 0;
        // 2. Rebuild the number from left to right (going backwards through our array slots)
        for (int i = count - 1; i >= 0; i--) {
            int d = digits[i];
            if (d % 2 == 0) {
                ans = ans * 10 + emax.poll();
            } else {
                ans = ans * 10 + omax.poll();
            }
        }
        
        return ans;
    }
}
