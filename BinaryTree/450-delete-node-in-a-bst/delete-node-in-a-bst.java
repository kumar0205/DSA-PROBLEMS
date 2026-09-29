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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;
        if (root.val == key && (root.left == null && root.right == null)) {
            return null;
        }
        if (root.val == key && root.left == null && root.right != null) {
            return root.right;
        }
        if (root.val == key && root.left != null && root.right == null) {
            return root.left;
        }
        TreeNode temp = root.right;
        if (root.val == key && root.left != null && root.right != null) {
            TreeNode s = min(temp, key);
            root.val=s.val;
            root.right=deleteNode(root.right,s.val);
            return root;
        }
        if (root.val>key) {
            root.left= deleteNode(root.left, key);
        }
        else root.right = deleteNode(root.right, key);

        return root;
    }

    public TreeNode min(TreeNode root, int key) {
        if (root == null)
            return null;
        TreeNode ls = min(root.left, key);
        if (ls == null) {
            return root;
        } else
            return ls;
    }
}