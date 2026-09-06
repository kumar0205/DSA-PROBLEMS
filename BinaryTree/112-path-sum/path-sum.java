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
    Boolean ans=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        ps(root,targetSum);
        return ans;
    }
    public int ps(TreeNode root , int sum){
        if(root==null) return sum;
        int ls=ps(root.left,sum-root.val);
        int rs=ps(root.right,sum-root.val);
        if(ls==0 && rs==0) ans =true;
        return sum-root.val;
    }
}