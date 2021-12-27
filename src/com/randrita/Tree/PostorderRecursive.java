package com.randrita.Tree;

import java.util.ArrayList;

public class PostorderRecursive {
    static class TreeNode1{
        int val;
        TreeNode1 left;
        TreeNode1 Right;
        TreeNode1(int data){
            this.val=data;
        }
    }

    void postOrderTraversal(TreeNode1 node, ArrayList<Integer> list){
        if(node==null){
            return;
        }
        postOrderTraversal(node.left,list);
        postOrderTraversal(node.Right,list);
        list.add(node.val);

    }


    public static void main(String[] args) {
        PostorderRecursive tree = new PostorderRecursive();
        TreeNode1 root1 = new TreeNode1(1);
        root1.left=new TreeNode1(2);
        root1.left.left=new TreeNode1(4);
        root1.left.Right=new TreeNode1(5);
        root1.Right=new TreeNode1(3);

        ArrayList<Integer> list = new ArrayList<>();

        tree.postOrderTraversal(root1,list);
        System.out.println("Postorder Traversal of a given tree: "+list);

    }
}
