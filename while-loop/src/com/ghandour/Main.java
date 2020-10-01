package com.ghandour;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // while loop used if we don't know how many number of loop

        byte firstNum = 0;
        byte secondNum = 0;
        short result = 0;
        Scanner scanner=  new Scanner(System.in);
        while(result == firstNum + secondNum) {

            firstNum = (byte)(Math.random() * 100);
            secondNum = (byte)(Math.random() * 100);
            System.out.print(firstNum + "+" + secondNum + "=");
            result = scanner.nextShort();
            System.out.println("Bravo!!");
        }
    }
}
