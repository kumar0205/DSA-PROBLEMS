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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root ==null) return null;
        TreeNode ls=null;
        TreeNode rs=null;
        if(root.val<val){
            rs=searchBST(root.right,val);
        }
        if(root.val>val){
            ls=searchBST(root.left,val);
        }
        if(root.val==val) return root;
        if(ls!=null) return ls;
        return rs;
    }
}