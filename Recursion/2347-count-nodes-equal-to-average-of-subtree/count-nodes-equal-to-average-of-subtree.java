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
    int count =0;
    public int[] pre(TreeNode node){
        if(node==null) return new int[]{0,0};
        int[] left=pre(node.left);
        int[] right=pre(node.right);
        int sum=left[0]+right[0]+node.val;
        int c=left[1]+right[1]+1;
        if(sum/c==node.val) count++;
        return new int[]{sum,c};
    }
    public int averageOfSubtree(TreeNode root) {
        pre(root);
        return count;
    }
}