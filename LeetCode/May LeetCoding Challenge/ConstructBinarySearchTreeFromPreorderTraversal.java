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
    public TreeNode bstFromPreorder(int[] preorder) {
        int start = 0;
        int end = preorder.length - 1;
        return constructBST(preorder, start, end);
    }
    
    private TreeNode constructBST(int[] preorder, int start, int end) {
        System.out.println(start+"="+end);
        if(start > end) {       
            return null;
        }
        int rootVal = preorder[start];
        TreeNode root = new TreeNode(rootVal);
        int i = start + 1;
        for(; i <= end; i++) {
            int nodeVal = preorder[i];
            if(nodeVal > rootVal) {
                break;
            }
        }
        root.left = constructBST(preorder, start + 1, i - 1);
        root.right = constructBST(preorder, i, end); 
        return root;
    }
}
