package com.randrita.Backtrackking;

import java.util.ArrayList;

public class mazePath {
    public static void main(String[] args) {
        System.out.println(pathRet("",3,3));
        //System.out.println(list);

    }

    static void path(String p, int row, int col){
        if(row==1 && col==1){
            System.out.println(p);
            return;
        }

        if(row>1){
            path(p+'D',row-1,col);
        }

        if(col>1){
            path(p+'R',row,col-1);

        }
    }

    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            list.addAll(pathRet(p + 'D', r-1, c));
        }

        if (c > 1) {
            list.addAll(pathRet(p + 'R', r, c-1));
        }

        return list;
    }
}
