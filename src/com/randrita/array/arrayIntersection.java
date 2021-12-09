package com.randrita.array;
//Find Array Intersection

public class arrayIntersection {
    public static void main(String[] args) {
        int[] a1={1,2,3,4,7};
        int[] a2={3,4,5,6,10,11};

        int p1=0;
        int p2=0;

        while(p1<a1.length && p2<a2.length){
            if(a1[p1]==a2[p2]){
                System.out.println(a1[p1]);
                p1++;
                p2++;
            }

            else if(a1[p1]<a2[p2]){
                p1++;
            }

            else{
                p2++;
            }
        }
    }
}
