package com.randrita.Tree;

import java.util.ArrayList;
import java.util.Stack;

public class TraversalIterative {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val=data;
        }
    }

    public void inorderTraversal(TreeNode root, ArrayList<Integer> list, Stack<TraversalIterative.TreeNode> stack){
        while(true){
            if(root!=null){
                stack.push(root);
                root=root.left;
            }

            else{
                if(stack.isEmpty()){
                    break;
                }
                root=stack.pop();
                list.add(root.val);
                root=root.right;
            }
        }

    }

    public static void main(String[] args) {
        TraversalIterative  tree = new TraversalIterative();
        TraversalIterative.TreeNode root = new TraversalIterative.TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.right=new TreeNode(5);
        root.left.left=new TreeNode(4);

        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        tree.inorderTraversal(root,list,stack);
        System.out.println("Inorder Traversal iterative approach: "+list);



    }
}
