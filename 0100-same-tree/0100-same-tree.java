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
    private Boolean flag=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        inorder(p,q);
        return flag;
    }
    public void inorder(TreeNode pnode,TreeNode qnode){
        if((pnode==null && qnode!=null) || (pnode!=null && qnode==null)){
            flag=false;
            return;
        }else if(pnode!=null && qnode!=null){
            inorder(pnode.left,qnode.left);
            if(pnode.val!=qnode.val){
                flag=false;
            }
            inorder(pnode.right,qnode.right);
        }
        
    }
}