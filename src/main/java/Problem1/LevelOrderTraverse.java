package Problem1;

import java.util.*;

public class LevelOrderTraverse {
    public static List<List<Integer>> levelOrder(TreeNode<Integer> root) {
        // homework
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return result;
        }
        queue.add(root);
        while (!(queue.isEmpty())) {
            int size = queue.size();
            List<Integer> rootLevel = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode<Integer> curr = queue.remove();
                rootLevel.add(curr.val);
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            result.add(rootLevel);
        }
        return result;
    }
}
