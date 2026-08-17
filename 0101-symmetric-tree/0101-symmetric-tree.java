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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<TreeNode> li = new ArrayList<>();
            while(size > 0){
                TreeNode node = q.poll();
                li.add(node);
                size--;
                if(node != null){
                    q.offer(node.left);
                    q.offer(node.right);
                }
            }
            if(!checkSymmetric(li))  return false;
        }
        return true;
    }
    public boolean checkSymmetric(ArrayList<TreeNode> li){
        int n = li.size();
        int i=0;
        int j=n-1;
        while(i<j){
            TreeNode left = li.get(i);
            TreeNode right = li.get(j);
            if(left == null && right == null){
                i++;
                j--;
                continue;
            }
            else if(left == null || right == null){
                return false;
            }
            else if(left.val != right.val){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}