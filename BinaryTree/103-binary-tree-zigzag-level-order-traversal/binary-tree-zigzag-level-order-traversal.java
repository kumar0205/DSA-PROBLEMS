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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return ans;
        q.offer(root);
        int index=0;
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> sl = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode t = q.poll();

                sl.add(t.val);

                if (t.left != null)
                    q.offer(t.left);

                if (t.right != null)
                    q.offer(t.right);
            }

            if (index % 2 == 1)
                Collections.reverse(sl);

            ans.add(sl);
            index++;
        }
        return ans;
    }
}