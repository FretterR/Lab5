package com.company;
/**Dice rolling App
 * tried to do as many method as i could for practice
 * roll  counter doesnt increment and you have to type
 * "y" or "n" twice to continue loop or exit
 * also still want to add validations to prevent things like -1 for sides
 * created by robert fretter 02/03/2017
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {





        Scanner scan1 = new Scanner(System.in);

        String userinput = "yes";
        do {                                                //user continue
            int numSides = welcome();

            roll(numSides);
            rollAgain();

            userinput = scan1.nextLine();

        } while (userinput.equalsIgnoreCase("y"));

    }

    public static String rollAgain() {                   //roll again method
        System.out.println("Roll again? y/n");
        Scanner scan1 = new Scanner(System.in);
        String userChoice = scan1.nextLine();
        return userChoice;                              //trying to return user response
    }

    public static int welcome() {                       //welcome method
        System.out.println("Welcome to the Grand Circus Casino");

        Scanner scan1 = new Scanner(System.in);
        System.out.println("\nHow many sides should each die have?\n");

        int sides = scan1.nextInt();
        return sides;

    }


    public static int roll(int sides) {                 //Roll method
        while (true) {
            //  int sides = 0;
            int dice1 = (int) (Math.random() * sides + 1);      //getting random number from die 1
            int dice2 = (int) (Math.random() * sides + 1);      //from die 2
            int sum = dice1 + dice2;
            int roll = 1;                                       // starts roll count at 1
            System.out.println("Roll:" + roll + "= " + sum);
            System.out.println(dice1);
            System.out.println(dice2);


            return roll++; //trying to increment rolls

        }
    }
}







