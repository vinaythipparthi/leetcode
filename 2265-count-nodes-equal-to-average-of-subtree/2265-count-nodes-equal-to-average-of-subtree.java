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
    int ans = 0;
    public int[] postOrder(TreeNode root){
        if(root == null)    return new int[]{0,0};

        int[] x = postOrder(root.left);
        int[] y = postOrder(root.right);
        
        int sum = x[0]+y[0]+root.val;
        int count = x[1]+y[1]+1;

        if(root.val == sum/count){
            ans++;
        }
        return new int[]{sum, count};
    }
    public int averageOfSubtree(TreeNode root) {
        postOrder(root);
        return ans;
    }
}