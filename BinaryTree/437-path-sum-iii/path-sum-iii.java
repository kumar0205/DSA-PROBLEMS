class Solution {

    long prefix = 0;
    long ans = 0;

    HashMap<Long, Integer> map = new HashMap<>();

    private void dfs(TreeNode root, int target) {

        if (root == null)
            return;

        prefix += root.val;

        // Number of valid paths ending here.
        ans += map.getOrDefault(prefix - target, 0);

        // Add current prefix.
        map.put(prefix, map.getOrDefault(prefix, 0) + 1);

        dfs(root.left, target);
        dfs(root.right, target);

        // Backtrack.
        map.put(prefix, map.get(prefix) - 1);

        prefix -= root.val;
    }

    public int pathSum(TreeNode root, int targetSum) {

        // Empty prefix.
        map.put(0L, 1);

        dfs(root, targetSum);

        return (int) ans;
    }
}