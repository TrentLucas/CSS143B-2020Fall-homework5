package Problem2;

import Problem1.TreeNode;

public class LCA {
    public static TreeNode<Integer> lowestCommonAncestor(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) {
        // homework
        // hint: pay attention to the assumptions of this problem.
        if (root == null || root.val == p.val || root.val == q.val) {
            return root;
        }

        TreeNode leftRoot = lowestCommonAncestor(root.left, p, q);
        TreeNode rightRoot = lowestCommonAncestor(root.right, p, q);
        if (leftRoot == null) {
            return rightRoot;
        }
        if (rightRoot == null) {
            return leftRoot;
        }
        return root;
    }
}
