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
    private List<Integer> treeList = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        printInorder(root);
        return treeList;
    }
    public void printInorder(TreeNode node){
        if (node == null)
            return;
 
        /* first recur on left child */
        printInorder(node.left);
 
        /* then print the data of node */
        treeList.add(node.val);
 
        /* now recur on right child */
        printInorder(node.right);
    
    }
}