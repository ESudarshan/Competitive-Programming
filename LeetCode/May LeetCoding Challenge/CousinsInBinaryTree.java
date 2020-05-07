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
    public boolean isCousins(TreeNode root, int x, int y) {
        int xDepth = findNodeDepth(root, x, 0);
        int yDepth = findNodeDepth(root, y, 0);
        if(xDepth != yDepth) {
            return false;
        }
        TreeNode xParent = findParentNode(root, x);
        TreeNode yParent = findParentNode(root, y);
        if(xParent.val == yParent.val) {
            return false;
        }
        return true;
    }
    
    int findNodeDepth(TreeNode node, int v, int d) {
        if(node == null) {
            return -1;
        }
        if(node.val ==v) {
            return d;
        }
        int left = findNodeDepth(node.left, v, d+1);
         if(left != -1) {
            return left;
        }
        int right = findNodeDepth(node.right, v, d+1);
        return right;
    }
    
    TreeNode findParentNode(TreeNode node, int v) {
        if(node == null || (node.left == null && node.right == null)) {
            return null;
        }
        if((node.left != null && node.left.val == v) || (node.right !=null && node.right.val == v)) {
            return node;
        }
        TreeNode left = findParentNode(node.left, v);
        if(left != null) {
            return left;
        }
        TreeNode right = findParentNode(node.right, v);
        return right;
    }
}