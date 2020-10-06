package com.ghandour;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // while loop used if we don't know how many number of loop
        /*
        byte firstNum = 0;
        byte secondNum = 0;
        short result = 0;
        Scanner scanner=  new Scanner(System.in);
        // please not that return inside while loop, will stop it
        while(result == firstNum + secondNum) {

            firstNum = (byte)(Math.random() * 100);
            secondNum = (byte)(Math.random() * 100);
            System.out.print(firstNum + "+" + secondNum + "=");
            result = scanner.nextShort();
            boolean resultIsRight = result == (firstNum + secondNum);
            if(resultIsRight) {
                System.out.println("Bravo!!");
            } else {
                System.out.println("you lose!!");
            }
        }

    */


    /*
            // in this case using do while is better because do fire the first time without while check.
        int firstNum;
        int secondNum;
        short result;
        int counter = 0;
        byte failureCounter = 0;
        int level = 1;
        Scanner scanner=  new Scanner(System.in);
        do {
            if(counter == 0) {
                System.out.println("You have three tries");
            }
            firstNum = (int)(Math.random() * level *100);
            secondNum =(int)(Math.random() * level * 100);
            System.out.print(firstNum + "+" + secondNum + "=");
            result = scanner.nextShort();
            boolean resultIsRight = result == (firstNum + secondNum);
            counter++;
            if(!resultIsRight) {
                if(failureCounter < 3) {
                    failureCounter++;
                    if(failureCounter == 3) {
                        System.out.println("you lose!!");
                        break;
                    }
                    System.out.println("wrong");
                    continue;
                }
            }
            System.out.println("Bravo!!");
            level = counter % 5 == 0 ? (counter + 5) / 5 : level;
        } while(true); // don't need condition since break will terminate when run
        //white((result == firstNum + secondNum) || failureCounter < 3)
    */

        // in this case using do while is better because do fire the first time without while check.
        int firstNum;
        int secondNum;
        short result;
        int counter = 0;
        byte failureCounter = 0;
        int level = 1;
        Scanner scanner=  new Scanner(System.in);
        while(true){
            if(counter == 0) {
                System.out.println("You have three tries");
            }
            firstNum = (int)(Math.random() * level *100);
            secondNum =(int)(Math.random() * level * 100);
            System.out.print(firstNum + "+" + secondNum + "=");
            result = scanner.nextShort();
            boolean resultIsRight = result == (firstNum + secondNum);
            counter++;
            if(!resultIsRight) {
                if(failureCounter < 3) {
                    failureCounter++;
                    if(failureCounter == 3) {
                        System.out.println("you lose!!");
                        break;
                    }
                    System.out.println("wrong");
                    continue;
                }
            }
            System.out.println("Bravo!!");
            level = counter % 5 == 0 ? (counter + 5) / 5 : level;
        }
    }
}
