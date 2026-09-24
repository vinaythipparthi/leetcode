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
    public boolean isValidBST(TreeNode root) {
        return checkBST(root.left, Long.MIN_VALUE, root.val) && checkBST(root.right, root.val, Long.MAX_VALUE);
    }
    public boolean checkBST(TreeNode root, long min, long max){
        //root should be between min and max
        if(root == null)    return true;
        int val = root.val;
        if(min >= val || max <= val)  return false;

        return checkBST(root.left, min, root.val) && checkBST(root.right, root.val, max);
    }
}