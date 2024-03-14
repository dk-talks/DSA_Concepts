/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> pPath = new ArrayList<>();
        ArrayList<TreeNode> qPath = new ArrayList<>();

        boolean b1 = findNode(root, p.val, pPath);
        boolean b2 = findNode(root, q.val, qPath);

        int pIdx = pPath.size()-1;
        int qIdx = qPath.size()-1;

        TreeNode ans = pPath.get(pIdx);
        while(pIdx >= 0 && qIdx >= 0) {
            if(pPath.get(pIdx).val != qPath.get(qIdx).val) {
                ans = pPath.get(pIdx+1);
                return ans;
            }
            pIdx--;
            qIdx--;
        }
        if(pIdx == -1) {
            return pPath.get(0);
        }
        return qPath.get(0);

    }
    public boolean findNode(TreeNode root, int k, ArrayList<TreeNode> path) {
        if(root == null) {
            return false;
        }
        if(root.val == k) {
            path.add(root);
            return true;
        }
        if(findNode(root.left, k, path) || findNode(root.right, k, path)) {
            path.add(root);
            return true;
        }
        return false;
    }
}
