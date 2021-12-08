package com.randrita.pattern;

public class allPattern {
    public static void main(String[] args) {

        //Pattern5(5);
        Pattern6(5);
    }


    public static void Pattern5(int n) {
        for (int i = 1; i <= (2 * n - 1); i++) {
            int value = i > n ? (n - (i - n)) : i;
            for (int j = 1; j < value; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void Pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
