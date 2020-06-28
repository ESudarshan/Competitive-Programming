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
    
    int ans;
    
    public int sumNumbers(TreeNode root) {
        sumRootToLeafNumbers(root, 0);
        return ans;
    }
    
    private void sumRootToLeafNumbers(TreeNode root, int num) {
        if(root == null) {
            return;
        }
        num = num * 10 + root.val;
        if(root.left == null && root.right == null) {
            ans = ans + num;
            return;
        }
        sumRootToLeafNumbers(root.left, num);
        sumRootToLeafNumbers(root.right, num);        
    }
        
}