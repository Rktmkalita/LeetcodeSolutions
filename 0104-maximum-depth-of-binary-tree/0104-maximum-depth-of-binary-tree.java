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
    public int maxDepth(TreeNode root) {
        int h=0;
        if(root==null){
            return h;
        }
        return height(root,h);
    }
    public int height(TreeNode root, int h) {
        if(root!=null){
            h++;
        }else{
            return h;
        }
        return Math.max(height(root.left,h), height(root.right,h));
    }
}