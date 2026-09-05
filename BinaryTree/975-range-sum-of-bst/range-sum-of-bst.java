// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     int sum=0;
//     public int rangeSumBST(TreeNode root, int low, int high) {
//         return rangeSumBST1(root,low,high);

//     }
//     public int rangeSumBST1(TreeNode root, int low, int high) {
//         if(root==null) return 0;
//         if(root.val>=low && root.val<=high) sum+=root.val;
//         rangeSumBST1(root.left, low, high);
//         rangeSumBST1(root.right, low, high);
//         return sum;
//     }
// }
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        
        // OPTIMIZATION 1: If current value is too small, skip the entire left subtree
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }
        
        // OPTIMIZATION 2: If current value is too large, skip the entire right subtree
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }
        
        // If it is in bounds, include it and check both sides
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}