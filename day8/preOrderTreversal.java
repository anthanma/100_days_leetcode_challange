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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        TreeNode node = root;
        helper(ans, node);
        return ans;
    }
    public void helper(List<Integer> ans ,TreeNode node){
        if(node == null){
            return;
        }
        // we know in pre order treversal we first take root then left then right 
        ans.add(node.val);
        helper(ans,node.left);

        helper(ans,node.right);
    }
}
