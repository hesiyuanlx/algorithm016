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
public class MinTreeDepth {

    public int minDepth(TreeNode root) {
        return helper(root, 1);
    }

    private int helper(TreeNode root, int level) {
        if (root == null) {
            return level - 1;
        }
        if (root.left == null) {
            return helper(root.right, level + 1);
        }
        if (root.right == null) {
            return helper(root.left, level + 1);
        }
        return Math.min(helper(root.right, level + 1), helper(root.left, level + 1));
    }

}