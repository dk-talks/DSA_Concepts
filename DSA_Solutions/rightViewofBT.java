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
        List<Integer> rightView = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) {
            return rightView;
        }
        q.add(root);

        while(q.size() > 0) {
            int size = q.size();
            for(int i = 0; i<size; i++) {
                TreeNode removed = q.remove();
                if(i == size-1) {
                    rightView.add(removed.val);
                }
                if(removed.left != null) {
                    q.add(removed.left);
                }
                if(removed.right != null) {
                    q.add(removed.right);
                }
            }
        }

        return rightView;
    }
}
