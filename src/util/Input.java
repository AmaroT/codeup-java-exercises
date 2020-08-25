package util;

import java.util.Scanner;

public class Input {
    private static final Scanner s = new Scanner(System.in);

    public static String getString(){

        return s.nextLine().trim().toLowerCase();
    }
    public static boolean yesNo(){
        System.out.println("Type [Y/N]: ");
        String myStr = getString();
        return (myStr.equalsIgnoreCase("yes") || (myStr.equalsIgnoreCase("y")));
    }
    public int getInt() {
//        System.out.println("Enter a number: ");
        String s = getString();
        int intNum = 0;
        try {
            // get input from the user
            // parse the input string as an integer
            // if valid, return the input

            intNum = Integer.parseInt(s);

        } catch (NumberFormatException nfe) {
            // catch runs if the "try" code throws an exception
            System.out.println("That is not a valid number " + nfe.getMessage());
            return getInt();
        }
        return intNum;
    }
    public int getInt(int min, int max){
        System.out.printf("Enter a number between %d and %d:\n",min, max);
        String myStr = getString();
        int num = Integer.parseInt(myStr);
        while (num < min || num > max) {
            System.out.printf("Enter a number between %d and %d:\n",min, max);
            myStr = getString();
            num = Integer.parseInt(myStr);
        }
        return num;
    }
    public double getDouble() {
        System.out.println("Please enter a number: ");
        String s = getString();
        double doubleNum = 0;
        try {

            doubleNum = Double.parseDouble(s);

        } catch (NumberFormatException nfe) {
            // catch runs if the "try" code throws an exception
            System.out.println("That is not a valid number " + nfe.getMessage());
            return getDouble();
        }
        return doubleNum;
    }


    public double getDouble(double min, double max){
        System.out.printf("Enter a number between %f and %f:\n",min, max);
        String myStr = getString();
        double num = Double.parseDouble(myStr);
        while (num < min || num > max) {
            System.out.printf("Enter a number between %f2 and %f2:\n",min, max);
            myStr = getString();
            num = Double.parseDouble(myStr);
        }
        return num;
    }

}