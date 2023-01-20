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
     public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        
        targetSum-=root.val;
        
        if(root.left==null && root.right==null && targetSum==0){
            return true;
        }
        
        if(root.left==null && targetSum!=0){
            return hasPathSum(root.right,targetSum);
        }
        
        if(root.right==null && targetSum!=0){
            return hasPathSum(root.left,targetSum);
        }
        
        return hasPathSum(root.right,targetSum) || hasPathSum(root.left,targetSum);
    }
    
    boolean traverseSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        
        targetSum-=root.val;
        
        if(root.left==null && root.right==null && targetSum==0){
            return true;
        }
        
        if(root.left==null && targetSum!=0){
            return traverseSum(root.right,targetSum);
        }
        
        if(root.right==null && targetSum!=0){
            return traverseSum(root.left,targetSum);
        }
        
        return traverseSum(root.right,targetSum) || traverseSum(root.left,targetSum);
    }
}