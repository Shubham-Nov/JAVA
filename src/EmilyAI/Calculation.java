package EmilyAI;
import java.util.Scanner;

public class Calculation {
    static Scanner input = new Scanner(System.in);

    //  PROGRAM FOR TAKING INPUT(NUMBERS) FROM USER AND STORING THEM IN ARRAY   //
    public static int[] takeInputNumbersAsArray(String value) {

        System.out.print("How many numbers you want to enter? -> ");

        int number = input.nextInt();

        int[] values = new int[number];

        System.out.print("Enter " + number + " values -> ");
        for (int i = 0; i < number; i++) {
            values[i] = input.nextInt();
        }

        return values;
    }

    //  PROGRAM FOR TAKING INPUT AS STRING FROM USER AND STORING THEM IN ARRAY    //
    public static String[] takeInputStringAsArray() {

        System.out.print("How many values you want to enter? -> ");

        int size = input.nextInt();
        input.nextLine();

        String[] values = new String[size];

        for (int i = 0; i < size; i++) {

            System.out.print("Enter " + (i+1) + " entry-> ");
            values[i] = input.nextLine();
        }

        return values;
    }

//    //MARKS TO PERCENTAGE CALCULATOR (OUT OF 100)//
//    public static  int marksToPercecntage() {
//
//        System.out.print("For how many subjects you want to calculate percentage?, Enter here -> ");
//        int number = input.nextInt();
//
//        int[] values = new int[number];
//
//        System.out.print("Enter the marks for each subject -> ");
//        for (i=0; i<number; i++) {
//            values[i] = input.nextInt();
//        }
//
//        int sum = add(values);
//    }

    //  PROGRAM FOR CALCULATE ADDITION  //
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i=0; i<array.length; i++) {
            sum+= array[i];
        }

        return sum;
    }
}
