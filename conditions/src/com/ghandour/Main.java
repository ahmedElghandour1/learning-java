package com.ghandour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    byte temperature = 20;
        boolean isWarm = false;
        // if condition
	    if (temperature > 18 && temperature < 30) {
	        isWarm = true;
        }
        System.out.println(isWarm);
	    // logical operator
	    int income = 120_000;
	    boolean hasHighIncome = income > 100_000;
        System.out.println(hasHighIncome);
        //ternary operator
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);
        //switch operator
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("you are admin");
                break;
            case "moderator":
                System.out.println("You are moderator");
                break;
            default:
                System.out.println("You are a gist");
        }
        /*
        * ======== Buzz Fizz example=========
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        float number = scanner.nextFloat();
        boolean divisibleBy3 = number % 5 == 0;
        boolean divisibleBy5 = number % 3 == 0;
        if(divisibleBy3 && divisibleBy5) {
            System.out.println("BuzzFuzz");
        } else if(divisibleBy3) {
            System.out.println("Buzz");
        } else if(divisibleBy5) {
            System.out.println("Fuzz");
        } else
            System.out.println((int)number);
    }
}
