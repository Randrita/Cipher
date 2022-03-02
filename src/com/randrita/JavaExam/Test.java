package com.randrita.JavaExam;

import series.*;
import java.io.*;
public class Test {
    public static void main(String [] args)throws IOException{

        //1st class
        Prime p=new Prime();
        int i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        do
        {
            System.out.println("Enter a number / 0 to exit");
            i=Integer.parseInt(br.readLine());
            p.prime(i);
            p.fibonacci(i);
            p.square(i);
        }
        while(i>0);

        //2nd class
        Series s = new Series();
        s.show();
        s.view();

    }
}
