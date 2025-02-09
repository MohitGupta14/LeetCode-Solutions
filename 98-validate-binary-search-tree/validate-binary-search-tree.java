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
    private List<Integer> store = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        inorderHelper(root);

        for(int i = 1 ; i < store.size(); i++){
            if(store.get(i-1) >= store.get(i)){
                return false;
            }
        }

        return true;
    }
  

    private void inorderHelper(TreeNode node) {
        if (node == null) return;

        inorderHelper(node.left); 

        store.add(node.val);

        inorderHelper(node.right); 
    }

}