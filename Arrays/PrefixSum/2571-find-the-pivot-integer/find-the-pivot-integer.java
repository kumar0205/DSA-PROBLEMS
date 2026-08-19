class Solution {
    public int pivotInteger(int n) {
        int sum = (n * (n + 1)) / 2;
        int pivot = (int) Math.sqrt(sum);
        // Check if it's a perfect square
        if (pivot * pivot == sum) {
            return pivot;
        }
        return -1;
    }
}