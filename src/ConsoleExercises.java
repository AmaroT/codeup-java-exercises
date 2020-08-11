import java.io.*;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately " + "%.2f",pi);
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter any number: ");
//        // This method reads the number provided using keyboard
//        int num = scan.nextInt();
//        //Closing Scanner after the use;
//        scan.close();
//        //Displaying the number
//        System.out.println("The number entered by user: "+num);
//        // If user inputs something besides a number, the log will throw an exception.

        //Exercise Scanner 2
        //Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine(); // getting a string value
        System.out.println("Please enter your age: ");
        String age = input.nextLine();// getting a numeric value
        System.out.println("What is your favorite hobby: ");
        String hobby = input.nextLine();
        System.out.print("Your name is " + name + "\n" + " and you are " + age + "\n" + "and you like to " + hobby);



    }

}
