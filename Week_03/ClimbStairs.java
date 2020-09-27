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
public class ClimbStairs {

    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        int pre = 1;
        int current = 2;
        int ans = 0;
        for (int i = 3; i <= n; i++) {
            ans = pre + current;
            pre = current;
            current = ans;
        }
        return ans;
    }

}