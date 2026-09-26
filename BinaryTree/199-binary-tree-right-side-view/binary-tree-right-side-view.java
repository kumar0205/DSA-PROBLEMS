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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        if(root==null) return l;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int s = q.size();
            for (int i = 0; i < s; i++) {
                if (i == s - 1) {
                    l.add(q.peek().val);
                }
                TreeNode t = q.poll();
                if (t.left != null)
                    q.offer(t.left);
                if (t.right != null)
                    q.offer(t.right);
            }

        }
        return l;
    }
}