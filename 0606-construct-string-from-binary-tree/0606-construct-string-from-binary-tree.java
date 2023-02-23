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
    public String tree2str(TreeNode root) {
        if(root.left==null && root.right==null){
            return String.valueOf(root.val);
        }
        StringBuilder sbr = new StringBuilder();
        sbr.append(root.val);
        if(root.left==null && root.right!=null){
            sbr.append("()");
        }
        helper(root.left,sbr);
        helper(root.right,sbr);
        return sbr.toString();
    }
    
    public void helper(TreeNode root, StringBuilder sbr){
        if(root==null){
            return;
        }
        sbr.append("("+root.val);
        if(root.left==null && root.right!=null){
            sbr.append("()");
        }
        helper(root.left,sbr);
        helper(root.right,sbr);
        sbr.append(")");
    }
}