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

    public static int getMinimumDifference(TreeNode root) {
        return inorderHelper(root, new int[]{Integer.MAX_VALUE}, new Integer[]{null});
    }

    private static int inorderHelper(TreeNode node, int[] minDiff, Integer[] prev) {
        if (node == null) return minDiff[0];

        inorderHelper(node.left, minDiff, prev);

        if (prev[0] != null) {
            minDiff[0] = Math.min(minDiff[0], node.val - prev[0]);
        }
        prev[0] = node.val;

        inorderHelper(node.right, minDiff, prev);
        
        return minDiff[0];
    }

}