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
    public List<Integer> inorderTraversal(TreeNode root) {
        // for INorder treversal we know the the rule that is Left ,root , right, that is go to left most subtree and after that come 
        //back to the node and then go to the right node 
        List<Integer> ans= new ArrayList<>();
        TreeNode node = root;
        helper(ans , node);
        return ans;
    }
    public void helper(List<Integer> ans ,TreeNode node){
        //base case 
        if(node == null){
            return ;
        }

        //recursive step 
        //first going to left node 
        helper(ans, node.left);
        ans.add(node.val);

        helper(ans,node.right);
        
    }
}
