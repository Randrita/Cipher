package com.randrita.array;

//Find Kth largest/Smallest element

public class KthLargest {
    public static void main(String[] args) {
        int k=4;
        int[] a={6,8,1,2,0,11};

        for(int i =0;i< a.length;i++){
            for(int j=i+1;j< a.length;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(i==k-1){
                System.out.println("The largest element at a required position is: "+a[i]);
                break;
            }
        }
    }
}
