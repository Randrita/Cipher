package com.randrita.Backtrackking;

public class mazeObstacles {
    public static void main(String[] args) {
        boolean[][] maze =
                {
                {true,true,true},
                {true,false,true},
                {true,true,true}
                };

        obs("",0,0,maze);
    }

    static void obs(String p,int r,int c, boolean[][] maze){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return ;
        }

        if(r< maze.length-1){
            obs(p+'D',r+1,c,maze);
        }

        if(c< maze[0].length-1){
            obs(p+'R',r,c+1,maze);
        }
    }
}
