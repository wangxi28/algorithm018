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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int l=maxDepth(root.left);   //递归求左子树
        int r=maxDepth(root.right);   //递归求右子树
        return Math.max(l,r)+1;   //比较左子树和右子树更大的那个+1
    }
}