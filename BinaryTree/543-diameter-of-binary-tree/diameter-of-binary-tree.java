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
    int maxi[]=new int[1];
    public int diameterOfBinaryTree(TreeNode root) {
        // int maxi=0;
        d(root);
        return maxi[0];
    }
    public int d(TreeNode root){
            if(root ==null) return 0;
            int lh=d(root.left );
            int rh=d(root.right);
            maxi[0]=Math.max(maxi[0],lh+rh);
            return 1+Math.max(lh,rh);
    }
}