package com.lazarin.practicing.leetcode.google.frequentquestions;

import com.lazarin.practicing.leetcode.tree.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

//https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another/
public class StepByStepDirectionsFromBinaryTreeNodetoAnother {

    public static void main(String args[]){

       /* Input: root = [5,1,2,3,null,6,4], startValue = 3, destValue = 6
        Output: "UURL"
        Explanation: The shortest path is: 3 → 1 → 5 → 2 → 6.*/
        TreeNode n6 = new TreeNode(6);
        TreeNode n4 = new TreeNode(4);
        TreeNode n2 = new TreeNode(2);
        n2.left = n6;
        n2.right = n4;
        TreeNode n3 = new TreeNode(3);
        TreeNode n1 = new TreeNode(1);
        n1.left = n3;
        TreeNode n5 = new TreeNode(5);
        n5.left = n1;
        n5.right = n2;
        System.out.println(getDirections(n5, 3, 6));

       /* Input: root = [2,1], startValue = 2, destValue = 1
        Output: "L"
        Explanation: The shortest path is: 2 → 1.*/

    }

    //Solution: take a binary tree, transform in a graph (adjacency list), and search for the shortest path
    public static String getDirections(TreeNode root, int startValue, int destValue) {

        //represent the tree as a graph - traverse as level order
        //map - Key = node value, value => all possible nodes to visit + its direction
        Map<Integer, List<NodeDirection>> graph = new HashMap<>();

        //queue to do a BFS
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();

            if(currentNode.left != null){

                updateGraph(graph, currentNode.left.val, currentNode.val, "U");
                updateGraph(graph, currentNode.val, currentNode.left.val, "L");

                queue.add(currentNode.left);
            }

            if(currentNode.right != null) {

                updateGraph(graph, currentNode.right.val, currentNode.val, "U");
                updateGraph(graph, currentNode.val, currentNode.right.val, "R");
                queue.add(currentNode.right);
            }
        }

        Queue<NodeDirection> queueFindPath = new LinkedList<>();
        //would be better to use a string builder, but I am going to use a string for simplicity
        queueFindPath.add(new NodeDirection(startValue, ""));

        Set<Integer> seenNodes = new HashSet<>();

        while(!queueFindPath.isEmpty()){

            NodeDirection currentPath = queueFindPath.poll();
            if(seenNodes.contains(currentPath.val)) {
                continue;
            }

            seenNodes.add(currentPath.val);

            if(currentPath.val == destValue){
                return currentPath.directionToParent;
            } else {
                List<NodeDirection> directions = graph.get(currentPath.val);
                for(NodeDirection direction : directions){
                    if(!seenNodes.contains(direction.val)){
                        queueFindPath.add(new NodeDirection(direction.val, currentPath.directionToParent + direction.directionToParent));
                    }
                }
            }

        }
        return "";
    }

    private static void updateGraph(Map<Integer, List<NodeDirection>> graph,
                             Integer key, Integer newDirectionVal, String newDirectionDesc){

        if(!graph.containsKey(key)){
            List<NodeDirection> nodeDirections = new ArrayList<>();
            nodeDirections.add(new NodeDirection(newDirectionVal, newDirectionDesc));
            graph.put(key, nodeDirections);
        } else {
            List<NodeDirection> directions = graph.get(key);
            directions.add(new NodeDirection(newDirectionVal, newDirectionDesc));
            graph.put(key, directions);
        }
    }

}
