/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        TreeNode ls = null;
        TreeNode rs = null;
        if (root.val < val) {
            rs = insertIntoBST(root.right, val);
        }
        if (root.val > val) {
            ls = insertIntoBST(root.left, val);
        }
        if (ls != null) {
            root.left = ls;
        }
        if (rs != null) {
            root.right = rs;
        }
        return root;
    }
}