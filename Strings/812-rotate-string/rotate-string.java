class Solution {
    public boolean rotateString(String s, String goal) {
        // Rotated string must be of the exact same length
        if (s.length() != goal.length()) {
            return false;
        }
        
        // If s + s contains goal, then goal is a valid rotation
        String doubled = s + s;
        return doubled.contains(goal);
    }
}
