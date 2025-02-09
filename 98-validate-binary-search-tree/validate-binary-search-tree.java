class Solution {
    private Integer prev = null; // Stores the previous node value

    public boolean isValidBST(TreeNode root) {
        return inorderHelper(root);
    }

    private boolean inorderHelper(TreeNode node) {
        if (node == null) return true;

     
        if (!inorderHelper(node.left)) return false;

        if (prev != null && node.val <= prev) {
            return false;
        }
        prev = node.val; 

        return inorderHelper(node.right);
    }
}
