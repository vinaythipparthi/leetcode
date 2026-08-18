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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        traversal(0, root, targetSum, li, ans);
        return ans;
    }
    public void traversal(int sum, TreeNode root, int targetSum, List<Integer> li, List<List<Integer>> ans){
        if(root == null)    return;

        sum += root.val;
        li.add(root.val);

        if(root.left == null && root.right == null){
            if(sum == targetSum)    ans.add(new ArrayList(li));
            li.remove(li.size()-1);
            return;
        }

        traversal(sum, root.left, targetSum, li, ans);
        traversal(sum, root.right, targetSum, li, ans);
        li.remove(li.size()-1);
    }
}