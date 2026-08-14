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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null)    return new ArrayList<>();

        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> li = new ArrayList<>();
            int size = q.size();
            while(size != 0){
                TreeNode nn = q.poll();
                li.add(nn.val);
                size--;
                if(nn.left != null) q.offer(nn.left);
                if(nn.right != null) q.offer(nn.right);
            }
            ans.add(li);
        }
        Collections.reverse(ans);
        return ans;
    }
}