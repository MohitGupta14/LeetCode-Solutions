class Solution {
    public void flatten(TreeNode root) {      
        
        if(root == null){
            return;
        }

        TreeNode rightSubTree = root.right;
        root.right = root.left;
        root.left = null;

        TreeNode current = root;
        while(current.right != null){
            current = current.right;
        }

        current.right = rightSubTree;
        flatten(root.right);
    }
}
