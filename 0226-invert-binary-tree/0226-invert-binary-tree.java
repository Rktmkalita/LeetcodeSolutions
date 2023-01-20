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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return root;
        helper(root,root.left,root.right);
        return root;
    }
    public void helper(TreeNode root,TreeNode left,TreeNode right){
        if(left==null && right==null)
            return;
        root.left=right;
        root.right=left;
        if(left!=null){
            helper(left,left.left,left.right);
        }
        if(right!=null){
            helper(right,right.left,right.right);
        }
    }
}