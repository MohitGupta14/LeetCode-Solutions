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
    private int count = 0; // To track the number of visited nodes
    private int result = -1; // To store the kth smallest element

    public int kthSmallest(TreeNode root, int k) {
        inorderHelper(root, k);
        return result;
    }

    private void inorderHelper(TreeNode node, int k) {
        if (node == null) return;

        inorderHelper(node.left, k); 

        count++;
        if (count == k) {
            result = node.val; 
            return;
        }

        inorderHelper(node.right, k); // Traverse right subtree
    }
}