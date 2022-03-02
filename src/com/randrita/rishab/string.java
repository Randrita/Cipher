package com.randrita.rishab;

public class string {
    public static void main(String[] args) {
        String s = "There are 36 bulbs in the basket out of which 33 are blue and 3 are green";
        String strArr[] = s.split(" ");
        int sum = 0;

        for (String i : strArr) {

            if (i.charAt(0) == '1' || i.charAt(0) == '0' || i.charAt(0) == '2' || i.charAt(0) == '3' || i.charAt(0) == '4' || i.charAt(0) == '5' || i.charAt(0) == '6' || i.charAt(0) == '7' || i.charAt(0) == '8' || i.charAt(0) == '9') {
                int val = Integer.parseInt(i);
                int count = val % 10;
                sum += count;
            }
        }

        System.out.println(sum);

    }

}

