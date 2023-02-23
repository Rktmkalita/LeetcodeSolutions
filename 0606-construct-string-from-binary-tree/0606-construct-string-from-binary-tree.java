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
        helper(root,sbr);
        return sbr.toString();
    }
    
    public void helper(TreeNode root, StringBuilder sbr){
        if (root==null) 
            return;
        
        if(root.left==null && root.right==null){
           sbr.append(root.val);
           return;
        }
        sbr.append(root.val);
        sbr.append('(');
        helper(root.left,sbr);
        sbr.append(')');
  
        if(root.right!=null){
            sbr.append('(');
            helper(root.right,sbr);
            sbr.append(')');
        } 
        return; 
    }
}