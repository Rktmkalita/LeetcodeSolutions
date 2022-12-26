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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>list=  new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            List<Integer>l = new ArrayList<>();
            int s = q.size();
            while(s-->0){
                TreeNode node = q.poll();
                l.add(node.val);
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            list.add(l);
        }
        return list;
    }
}