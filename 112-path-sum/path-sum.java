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
    
    boolean ans = false;
    public boolean check(TreeNode root, int targetSum,int sum){
        if(root == null) return false;

        sum = sum + root.val;
        if(root.left == null && root.right == null){
           return sum == targetSum;
        }

        
       
        return check(root.left,targetSum,sum) ||check(root.right,targetSum,sum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        return check(root,targetSum, sum);
        
    }
}