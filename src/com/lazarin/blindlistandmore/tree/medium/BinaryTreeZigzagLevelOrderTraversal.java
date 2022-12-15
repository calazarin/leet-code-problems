package com.lazarin.blindlistandmore.tree.medium;

import com.lazarin.blindlistandmore.tree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String args[]){

    }

    //T: O(N)
    //S: O(N)
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> resp = new ArrayList<>();
        if(root != null) {
            //bfs
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            //true = L-N-R | true = R-N-L
            boolean orderControl = true;

            while(!queue.isEmpty()){

                int qSize = queue.size();
                Integer[] partial_res = new Integer[qSize];
                for(int i = 0; i < qSize; i++){ //tree level run
                    var curr = queue.poll();
                    int insertIndex = orderControl ? i  : (qSize - 1 - i);
                    partial_res[insertIndex] = curr.val;
                    if(curr.left != null){
                        queue.add(curr.left);
                    }
                    if(curr.right != null) {
                        queue.add(curr.right);
                    }
                }
                orderControl = !orderControl;
                resp.add(Arrays.asList(partial_res));
            }
        }
        return resp;
    }
}
