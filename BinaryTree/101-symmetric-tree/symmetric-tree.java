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
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric1(root.left,root.right);
    }
     public boolean isSymmetric1(TreeNode a, TreeNode b) {
        if(a==null && b==null) return true;
        if(a==null && b!=null) return false;
        if(a!=null && b==null) return false;
        if(a.val!=b.val) return false;
        boolean ls= isSymmetric1(a.left,b.right);
        boolean rs= isSymmetric1(a.right,b.left);
        if(ls&&rs) return true;
        return false;
    }
}