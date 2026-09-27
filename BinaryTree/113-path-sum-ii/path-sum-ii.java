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
    List<List<Integer>> an = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ps(root,targetSum,new ArrayList<>());
        return an;
    }
    public void ps(TreeNode root, int ts, List<Integer> l){
        if(root == null) return;
        l.add(root.val);
        if((root.left==null && root.right==null) && ts-root.val==0) an.add(new ArrayList<>(l));
        ps(root.left,ts-root.val,l); 
        ps(root.right,ts-root.val,l);
        l.remove(l.size()-1);
        
    }}
        