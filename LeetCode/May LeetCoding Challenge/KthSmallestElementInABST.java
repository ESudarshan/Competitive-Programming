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
    int currK = 0;
    int reqK;
    int kth = -1;
    
    public int kthSmallest(TreeNode root, int k) {
        reqK = k;
        inorder(root);
        return kth;
    }
    
    private void inorder(TreeNode root) {
        if(root.left != null) {
            inorder(root.left);
        }
        currK++;
        if(currK == reqK){
            kth = root.val;
            return;
        }
        if(root.right != null) {
            inorder(root.right);
        }
    }
}

/*
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list.get(k - 1);
    }
    
    private void inorder(TreeNode root, List<Integer> list) {
        if(root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
*/