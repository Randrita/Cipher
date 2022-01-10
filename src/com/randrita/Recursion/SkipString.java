package com.randrita.Recursion;

public class SkipString {
    public static void main(String[] args) {
        String s="abcdmangoefg";
        skipMango(s,"");
    }

    static void skipMango(String s,String p){
        if(s.length()==0){
            System.out.println(p);
            return;
        }
        if(s.startsWith("mango")){
            skipMango(s.substring(5),p);
        }
        else{
            char ch = s.charAt(0);
            skipMango(s.substring(1),p+ch);
        }
    }
}
