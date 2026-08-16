class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0, r = 0, n = fruits.length, maxfruits = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        while (r < n) {
            hm.put(fruits[r], r);
            if (hm.size() > 2) {
                int key1 = 0;
                int value1 = Integer.MAX_VALUE; 
                for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                    if (entry.getValue() < value1) {
                        key1 = entry.getKey();
                        value1 = entry.getValue();
                    }
                }
                l = value1 + 1;
                hm.remove(key1);
            }
            maxfruits = Math.max(maxfruits, r - l + 1);
            r++;
        }
        return maxfruits;
    }
}