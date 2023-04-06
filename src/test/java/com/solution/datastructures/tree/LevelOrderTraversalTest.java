package com.solution.datastructures.tree;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class LevelOrderTraversalTest {

    @Spy
    LevelOrderTraversal levelOrderTraversal;

    @Test
    void levelOrder() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        List<Integer> level1 = List.of(1);
        List<Integer> level2 = List.of(2, 3);
        List<Integer> level3 = List.of(4, 5, 6, 7);
        List<List<Integer>> expected = List.of(level1, level2, level3);

        assertThat(levelOrderTraversal.levelOrder(treeNode1)).isEqualTo(expected);
    }
}