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
    public List<List<Integer>> levelOrder(TreeNode root) {
          List<List<Integer>> l=new ArrayList<>();
          if(root==null) return l;
          Queue<TreeNode> st = new LinkedList<>();
          st.offer(root);
          while(!st.isEmpty()){
            int len = st.size();
            List<Integer> sub=new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode temp=st.poll();
                sub.add(temp.val);
                if(temp.left!=null) st.offer(temp.left);
                if(temp.right!=null) st.offer(temp.right);
            }
            l.add(sub);
          }
          return l;
    }
}