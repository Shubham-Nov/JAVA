package EmilyAI;

import java.util.Arrays;
import java.util.Scanner;

public class Ui {

    //  AVAILABLE INFORMATION AND FUNCTIONS/METHODS   //
    static String[] contentInformation = {"Naming Conventions"};
    static String[] contentMethods = {"Addition", "Make a list"};

    //  PROGRAM TO PRINT STARTING TEXT AND ASK WHAT OPERATION USER WANT TO PERFORM  //
    public static void userInterface() {

        Scanner input = new Scanner(System.in);

        System.out.println("hello, Shubham");
        System.out.println("What are you looking for?, Type 'help' to see what information and functions are available for you right now and please be patient i am adding new information and functions for you every day.");

        String value = input.nextLine();


        if (Arrays.asList(contentInformation).contains(value) || Arrays.asList(contentMethods).contains(value)){

            userInput(value);
        } else if (value.equals("help")) {

            help();
        } else {

            System.out.println("Command not found.");
        }
    }

    //  PROGRAM FOR TAKING USER STRING INPUT    //
    public static void userInput(String value) {

        value = value.toLowerCase();

        if (value.equals("addition")) {

            System.out.print("Total = " + Calculation.calculateSum(Calculation.takeInputNumbersAsArray(value)));
        } else if (value.equals("make a list")) {

            System.out.println("Here is your list -> " + Arrays.toString(Calculation.takeInputStringAsArray()));
        } else if (value.equals("help")) {

            help();
        }
    }

    //  PROGRAM TO TELL USER WHAT CONTENT IS AVAILABLE  //
    public static void help() {

        System.out.println("\nAvailable Information");
        for (int i=0; i<contentInformation.length; i++){
            System.out.println((i+1) + ") " + contentInformation[i]);
        }

        System.out.println("\nAvailable Methods/Functions");
        for (int i=0; i<contentMethods.length; i++){
            System.out.println((i+1) + ") " + contentMethods[i]);
        }
    }
}
