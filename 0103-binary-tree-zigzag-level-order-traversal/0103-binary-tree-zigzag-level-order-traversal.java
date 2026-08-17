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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null)    return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean flag = true;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> li = new ArrayList<>();
            int size = q.size();
            while(size > 0){
                TreeNode nn = q.poll();
                li.add(nn.val);
                if(nn.left != null) q.offer(nn.left);
                if(nn.right != null) q.offer(nn.right);
                size--;
            }
            //
            if(flag){
                flag = false;
            }
            else{
                Collections.reverse(li);
                flag = true;
            }
            ans.add(li);
        }
        return ans;
    }
}