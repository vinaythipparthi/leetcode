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
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null)    return new ArrayList<>();

        List<Integer> li = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            //
            Queue<TreeNode> dup = new ArrayDeque<>(q);
            while(!dup.isEmpty()){
                TreeNode nn = dup.poll();
                if(dup.size() == 0) li.add(nn.val);
            }
            //
            while(size != 0){
                TreeNode nn = q.poll();
                size--;
                if(nn.left != null) q.offer(nn.left);
                if(nn.right != null) q.offer(nn.right);
            }
        }
        return li;
    }
}