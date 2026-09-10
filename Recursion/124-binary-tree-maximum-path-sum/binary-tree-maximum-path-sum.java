class Solution {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        sum(root);
        return max;
    }

    public int sum(TreeNode root) {
        if (root == null) return 0;

        int ls = sum(root.left);
        int rs = sum(root.right);

        if (ls < 0) ls = 0;
        if (rs < 0) rs = 0;

        max = Math.max(max, ls + rs + root.val);

        return root.val + Math.max(ls, rs);
    }
}