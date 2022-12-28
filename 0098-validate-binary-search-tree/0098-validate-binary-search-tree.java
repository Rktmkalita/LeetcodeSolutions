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
//     public boolean isValidBST(TreeNode root) {
//         return isBSTUtil(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
//     }
//     boolean isBSTUtil(TreeNode root,int min,int max){
//         if(root==null){
//             return true;
//         }
        
//         boolean left,right;
        
//         if(root.left==null){
//             left = true;
//         }else if(root.left.val<root.val && root.left.val>min){
//             left=true;
//         }else{
//             return false;
//         }
        
//         if(root.right==null){
//             right = true;
//         }else if(root.right.val>root.val && root.right.val<max){
//             right=true;
//         }else{
//             return false;
//         }
       
//         return isBSTUtil(root.left,min<root.val?min:root.val,max) && isBSTUtil(root.right,min,max>root.val?max:root.val) && left && right;
//     }
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValid(TreeNode root, long min, long max) {
        if (root == null) return true;
        if (root.val >= max || root.val <= min) return false;

        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
    }
}