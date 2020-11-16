package Problem3;

import Problem1.TreeNode;

public class InsertInBST {
    public static void insert(TreeNode<Integer> root, int valToInsert) {
        // homework
        if (root == null) {
            return;
        }

        if (valToInsert < root.val) {
            if (root.left != null) {
                insert(root.left, valToInsert);
            } else {
                root.left = new TreeNode(valToInsert);
            }
        } else {
            if (root.right != null) {
                insert(root.right, valToInsert);
            } else {
                root.right = new TreeNode(valToInsert);
            }
        }
    }
}
