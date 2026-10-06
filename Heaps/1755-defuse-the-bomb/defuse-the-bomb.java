class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length,sum=0;
        int[] ans = new int[n];
        if(k==0) return ans;
        if (k > 0) {
            for (int i = 1; i <= k; i++) {
                sum += code[i%n];
            }
            ans[0] = sum;
            int i = 1;
            while (true) {
                if (i == n)
                    break;
                sum -= code[i];
                sum += code[(i + k) % n];
                ans[i++] = sum;
            }
        } else {
            k=-1*k;
            for (int i = n - 1; i > n -1- k; i--) {
                sum += code[i];
            }
            ans[0] = sum;
            int i = 1;
            while (true) {
                if (i == n)
                    break;
                sum -= code[(i - 1 - k + n) % n];
                sum += code[(i - 1 + n)%n];
                ans[i++] = sum;
            }
        }
        return ans;
    }
}