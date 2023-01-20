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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null;
        }
        return helper(root,val);
    }
    public TreeNode helper(TreeNode root, int val){
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        TreeNode left=helper(root.left,val);
        TreeNode right=helper(root.right,val);
        if(left!=null){
            return left;
        }else if(right!=null){
            return right;
        }else{
            return null;
        }
    }
}