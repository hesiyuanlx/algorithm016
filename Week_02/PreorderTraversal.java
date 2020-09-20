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
public class PreorderTraversal {

    private List<Integer> ans = new LinkedList();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return ans;
        }
        helper(root);
        return ans;
    }

    private void helper(TreeNode currentNode) {
        if (currentNode == null) {
            return;
        }
        helper(currentNode.left);
        ans.add(currentNode.val);
        helper(currentNode.right);
    }
}