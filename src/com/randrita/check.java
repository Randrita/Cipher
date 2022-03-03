package com.randrita;
class check {

    public static void main(String[] args) {
        String s="abc";
        String t="ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    public static int isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        int count=0;
        return checki(s,t,i,j,count);
    }

    static int checki(String s, String t,int i,int j,int count){


        //boolean res=false;
        //base
        if(j>=t.length() || i>=s.length()){
            return i;
        }

        if(s.charAt(i)==t.charAt(j)){

            checki(s,t,i+1,j+1,count+=1);
        }

        else{
            checki(s,t,i,j+1,count);

        }
        return i;

    }
}
