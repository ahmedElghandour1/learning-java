package com.ghandour;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public  static void main(String[] args) {
        double mortgage;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        float principal = scanner.nextFloat();
        System.out.print("Enter annual interest rate: ");
        float annualInterestRate = scanner.nextFloat();
        System.out.print("Enter Number of payments: ");
        short numberOfPayments = scanner.nextShort();
        float monthlyInterest = annualInterestRate / (100*12);
        mortgage = principal *  monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        String mortgageStr = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgageStr);

    }
}
