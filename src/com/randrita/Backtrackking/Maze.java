package com.randrita.Backtrackking;

public class Maze {
    public static void main(String[] args) {
        System.out.println(maze(3,3));
    }

    static int maze(int row,int col){

        //Base Condition
        if(row==1 || col == 1){
            return 1;
        }

        int left = maze(row-1,col);
        int right = maze(row,col-1);

        return left+right;


    }
}
