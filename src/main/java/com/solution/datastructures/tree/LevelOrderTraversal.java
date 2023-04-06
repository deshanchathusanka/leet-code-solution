package com.solution.datastructures.tree;
import java.util.*;

/**
 * The solution for Tree Level Order Traversal
 * @author deshan
 * @since 1.0
 */
public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> values = new ArrayList<>();
        if (root != null) {
            Queue<TreeNode> rootQueue = new LinkedList<>();
            rootQueue.add(root);
            traverse(rootQueue, values);
        }
        return values;
    }

    private void traverse(Queue<TreeNode> queue, List<List<Integer>> values) {
        if (queue.isEmpty()) {
            return;
        }
        List<Integer> rowValues = new ArrayList<>();
        Optional<TreeNode> value = Optional.ofNullable(queue.poll());
        Queue<TreeNode> nextLevelQueue = new LinkedList<>();
        while (value.isPresent()) {
            TreeNode node = value.get();
            Optional.ofNullable(node.left).ifPresent(nextLevelQueue::add);
            Optional.ofNullable(node.right).ifPresent(nextLevelQueue::add);
            rowValues.add(node.val);
            value = Optional.ofNullable(queue.poll());
        }
        values.add(rowValues);
        traverse(nextLevelQueue, values);
    }
}
