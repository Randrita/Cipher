package com.randrita.Recursion;

public class RemoveAs {
    public static void main(String[] args) {
        String s="abcdae";
        String p="";
        System.out.println(removeAs(s,p,0));
        substring(s,p);
    }

    static String removeAs(String s, String p,int i){
        if(i>s.length()-1){
            return p;
        }
        if(s.charAt(i)=='a'){
                return removeAs(s,p,i+1);
            }
        else {
                char ch=s.charAt(i);
                return removeAs(s,p+ch,i+1);
            }

    }

    //using substring method
    static void substring(String s,String p){
        if(s.length()==0){
            System.out.println(p);
            return;
        }
        char ch= s.charAt(0);
        if(ch=='a'){
            substring(s.substring(1),p);
        }else{
            substring(s.substring(1),p+ch);
        }
    }
}
