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
    public boolean isBalanced(TreeNode root) {
        int ans = traversal(root);
        if(ans == -1){
            return false;
        }
        return true;
    }
    public int traversal(TreeNode root){
        if(root == null)    return 0;

        int x = traversal(root.left);
        if(x == -1) return -1;
        int y = traversal(root.right);
        if(y == -1) return -1;

        if(Math.abs(x-y) > 1) return -1;

        return 1+Math.max(x,y);
    }
}