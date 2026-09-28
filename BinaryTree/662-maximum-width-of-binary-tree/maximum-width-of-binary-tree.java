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

    static class Pair {
        TreeNode node;
        long index;

        Pair(TreeNode node, long index) {
            this.node = node;
            this.index = index;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {

        if (root == null) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        long max = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            long start = q.peek().index;
            long end = start;

            for (int i = 0; i < size; i++) {

                Pair p = q.poll();

                end = p.index;

                if (p.node.left != null) {
                    q.offer(new Pair(
                        p.node.left,
                        2 * p.index + 1
                    ));
                }

                if (p.node.right != null) {
                    q.offer(new Pair(
                        p.node.right,
                        2 * p.index + 2
                    ));
                }
            }

            max = Math.max(max, end - start + 1);
        }

        return (int) max;
    }
}