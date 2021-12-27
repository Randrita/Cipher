package com.randrita.Tree;

import java.util.ArrayList;

public class InorderRecursive {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode Right;
        TreeNode(int data){
            this.val=data;
        }
    }

    void inorderTraversal(TreeNode node, ArrayList<Integer> list){
        if(node==null){
            return;
        }
        inorderTraversal(node.left,list);
        list.add(node.val);
        inorderTraversal(node.Right,list);}


    public static void main(String[] args) {
        InorderRecursive tree = new InorderRecursive();
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.left.Right=new TreeNode(5);
        root.Right=new TreeNode(3);

        ArrayList<Integer> list = new ArrayList<>();

        tree.inorderTraversal(root,list);
        System.out.println("Inorder Traversal of a given tree: "+list);

    }
}
