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
    public int goodNodes(TreeNode root) {
        return countGoodNodes(root, root.val);
    }
    
    public int countGoodNodes(TreeNode root, int maxValue) {
        if (root == null) {
            return 0;
        }
        
        int count = 0;
        if (root.val >= maxValue) {
            count = 1;
            maxValue = root.val;
        }
        
        count += countGoodNodes(root.left, maxValue);
        count += countGoodNodes(root.right, maxValue);

        return count;
    }
}
