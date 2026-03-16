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
    int max = 0; 

    public int maxDepth(TreeNode root) {  
        if (root == null) return 0;  
        helper(root, 1);
        return max;
    }
    
    public void helper(TreeNode node, int cdepth) {

        if (node == null) {
            return;
        }
        
        if (cdepth > max) {
            max = cdepth;
        }
        
        helper(node.left, cdepth + 1);
        
        helper(node.right, cdepth + 1);
    }
}
