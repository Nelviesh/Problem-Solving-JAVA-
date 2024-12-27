class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true; // An empty tree is symmetric
        }
        return isMirror(root.left, root.right);
    }

    // Helper function to check if two trees are mirrors of each other
    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true; // Both are null, so they are symmetric
        }
        if (left == null || right == null) {
            return false; // One is null, the other is not, so they are not symmetric
        }
        // Check the value of the nodes and recursively check the mirror properties of subtrees
        return (left.val == right.val) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
