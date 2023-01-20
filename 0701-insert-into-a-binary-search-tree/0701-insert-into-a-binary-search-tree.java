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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        if(root.val<val){
            helperR(root,root.right,val);
        }else{
            helperL(root,root.left,val);
        }
        return root;
    }
    public void helperR(TreeNode parent,TreeNode right, int val){
        if(right==null){
            parent.right=new TreeNode(val);
            return;
        }
        if(right.val<val){
            helperR(right,right.right,val);
        }else{
            helperL(right,right.left,val);
        }
    }
    public void helperL(TreeNode parent,TreeNode left, int val){
        if(left==null){
            parent.left=new TreeNode(val);
            return;
        }
        if(left.val<val){
            helperR(left,left.right,val);
        }else{
            helperL(left,left.left,val);
        }
    }
}