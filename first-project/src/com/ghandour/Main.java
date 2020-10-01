package com.ghandour;

import java.awt.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/*
* types in java:
* primitive types:
*   1- byte 1 byte range [-128, 127]
*   2- short 2 bytes range [-32k, 32k]
*   3- int 4 bytes range [-2B, 2B]
*   4-long 8 bytes range very lage numbers]
*   *** for decimal numbers ***
*   5-double 4 bytes
*   6-double 8 bytes
*   -----------------
*   7-char 2 bytes [A, b, c,....]
*   8-boolean 1 byte  [true, false]
 * */
public class Main {

    public static void main(String[] args) {
        byte age = 30;
        long viewsCount = 3_123_435_344L;
        float price = 10.99F;
        char letter = 'A';
        boolean isRequired = true;
        Date now = new Date();
        long time = now.getTime();
        System.out.println(now);
        System.out.println(time);
        /*-----Reference types----------*/
        Point point = new Point(10, 20);
        System.out.println(point.distance(100, 22));
        String msg = "Hello \n World" + "!!!";
        System.out.println(msg.length());
        // String is immutable, methods make new value without change the original.
        System.out.println(msg.replace("l", "L"));
        System.out.println(msg);
        /*------Arrays-------*/
        // remember that arrays are fixed in java (can't add / edit remove items)
        int[] numbers = new int[5]; // older way
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));
        float[] otherNumbers = {1, 2,45,2, 0, 454, 0.546F, -45}; //newer way
        Arrays.sort(otherNumbers);
        System.out.println(Arrays.toString(otherNumbers));
        // multi dimension array
        int[][] multi = new int[3][3];
        multi[0][1] = 10;
        multi[2][2] = 20;
        System.out.println(Arrays.deepToString(multi));
        /*------constants-------*/
        final float PI = 3.14f;
        /*------Arithmetic ops-------*/
        int result1 = 10 / 3; //3
        float result2 = (float)10 / (float)3; // 3.33333
        double result3 = (double)10 / (double)3; // 3.3333333335
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        int x = 10;
        int y = ++x; // x = 11, y = 11
        int z = y++; // y = 12, z = 11

        /*------Casting-------*/
        // implicit casting
        /*
        in this case an anonymous int variable
        is created at the memory
        and then, it added instead of x
        */
        short xx = 10;
        int yy=  xx + 100;
        //--------
        /*
        in this case two anonymous float variables
        are created at the memory
        and then, it added instead of "2" and xxx
        */
        int xxx = 10;
        float yyy = xxx + 2;
        System.out.println(yy);
        System.out.println(yyy);
        String num = "10.435";
        System.out.println(Float.parseFloat(num));
        /*------Math class-------*/
        int randNumber = (int)(Math.random() * 100);
        System.out.println(randNumber);
        /*------Number formatting-------*/
        // no need to use new key word because its an abstract class
        // get**Instance means it's a factory class
        String currency = NumberFormat.getCurrencyInstance().format(2876713.32432324);
        String percent = NumberFormat.getPercentInstance().format(0.32432324);
        System.out.println(currency);
        System.out.println(percent);
        /*------Reading Input-------*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("my name is: ");
        String myName = scanner.nextLine().trim(); // .next() will take the first word only
        System.out.print("my age is: ");
        byte myAge = scanner.nextByte();
        System.out.print("my height is: ");
        float myHeight = scanner.nextFloat();
        System.out.println(myName + ", " + myAge + ", " + myHeight);
    }
}
