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
    List<String> l = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        p(root, new StringBuilder());
        return l;
    }

    public void p(TreeNode root, StringBuilder s) {
        if (root == null) return;

        int len = s.length();

        s.append(root.val);

        if (root.left == null && root.right == null) {
            l.add(s.toString());
        } else {
            s.append("->");
            p(root.left, s);
            p(root.right, s);
        }

        s.setLength(len);
    }
}