package com.lazarin.practicing.leetcode.tree.medium;

import org.junit.jupiter.api.Test;
import com.lazarin.practicing.leetcode.tree.medium.ConstructBinarySearchTreeFromPreorderTraversal.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link ConstructBinarySearchTreeFromPreorderTraversal}
 */
public class ConstructBinarySearchTreeFromPreorderTraversalTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        ConstructBinarySearchTreeFromPreorderTraversal solution = new ConstructBinarySearchTreeFromPreorderTraversal();
        TreeNode resp = solution.bstFromPreorder(new int[]{8,5,1,7,10,12});
        List<Integer> respInOrderValues = collectValInOrder(resp);
        assertThat(respInOrderValues, is(Arrays.asList(1,5,7,8,10,12)));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {
        ConstructBinarySearchTreeFromPreorderTraversal solution = new ConstructBinarySearchTreeFromPreorderTraversal();
        TreeNode resp = solution.bstFromPreorder2(new int[]{8,5,1,7,10,12});
        List<Integer> respInOrderValues = collectValInOrder(resp);
        assertThat(respInOrderValues, is(Arrays.asList(1,5,7,8,10,12)));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach3() {
        ConstructBinarySearchTreeFromPreorderTraversal solution = new ConstructBinarySearchTreeFromPreorderTraversal();
        TreeNode resp = solution.bstFromPreorder3(new int[]{8,5,1,7,10,12});
        List<Integer> respInOrderValues = collectValInOrder(resp);
        assertThat(respInOrderValues, is(Arrays.asList(1,5,7,8,10,12)));
    }

    private List<Integer> collectValInOrder(TreeNode root){
        List<Integer> values = new ArrayList<>();
        inOrderTraversal(root, values);
        return values;
    }

    private void inOrderTraversal(TreeNode root, List<Integer> values){
        if(root == null) return;
        inOrderTraversal(root.left, values);
        values.add(root.val);
        inOrderTraversal(root.right, values);
    }
}
