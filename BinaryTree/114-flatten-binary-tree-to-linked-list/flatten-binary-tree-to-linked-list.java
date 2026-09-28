import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;
        // Use Deque interface with ArrayDeque implementation
        Deque<TreeNode> st = new ArrayDeque<>();
        flatten1(root, st);
    }
    
    public void flatten1(TreeNode root, Deque<TreeNode> st) {
        // 1. If there is a right child, push it to the stack to process later
        if (root.right != null) {
            st.push(root.right);
        }
        
        // 2. Move the left child to the right side
        if (root.left != null) {
            root.right = root.left;
            root.left = null; // Always set left to null
        } 
        // 3. If there is no left child, pop the next available node from the stack
        else if (!st.isEmpty()) {
            root.right = st.pop();
        }
        
        // 4. Continue moving down the reconstructed right path
        if (root.right != null) {
            flatten1(root.right, st);
        }
    }
}
