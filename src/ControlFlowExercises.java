import java.io.*;
import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        //a. While Loop
//        int i = 5;
//        while(i <= 15) {
//            System.out.printf("%d ", i);
//            i++;
//        }
//        System.out.println();
        //b. Do While
//        int i = 0;
//        do{
//            System.out.println(i);
//            i +=2;
//        }while(i <= 100);
//        int i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        }while(i >= -10);
//        long i = 2;
//        do{
//            System.out.println(i);
//            i *= i;
//        }while(i <= 1000000);
        //C. Refactor for a For Loop from the Above Loops
        //C -1
//        for(int i = 5;i <= 15; i++){
//            System.out.printf("%d ", i);
//        }
        //C -2
//        for(int i = 100; i >= -10; i -= 5 ){
//            System.out.printf("%d ", i);
//        }
        //C - 3
//        for (long i = 2; i <= 1000000; i*=i ){
//            System.out.printf("\n%d ", i);
//        }
        //2 FizzBuzz
//        int n = 100;
//        for(int i = 0; i <= n;i++){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            }else if(i % 3 == 0){
//                System.out.println("Fizz");
//            }else if(i % 5 == 0){
//                System.out.println("Buzz");
//            }
//        }
        // 3. Table of Powers
//        System.out.println("Welcome to Squares and Cubes! ");
//        System.out.println();
//        Scanner sc = new Scanner(System.in);
//        String choice = "y";
//        while(choice.equalsIgnoreCase("y"))
//        {
//            //get the input from user
//            System.out.println("Enter an Integer: ");
//            int integerNext = sc.nextInt();
//            System.out.println("Number" + " " + "Squared" + " " + "Cubed");
//            System.out.println("======" + " " + "======" + " "+ "======");
//            for(int i = 1; i <= integerNext; i++)
//            {
//                int numberSquared = (int) Math.pow(i, 2);
//                int numberCubed = (int) Math.pow(i, 3);
//                String message = " \n" + i + "      " + numberSquared + "      " + numberCubed;
//                System.out.println(message);
//
//            }
//            //Check user if they want to continue
//            System.out.print("Continue? (y/n): ");
//            choice = sc.next();
//            System.out.println();
//
//        }
        //4. Convert given number grades into letter grades


//        Scanner grade = new Scanner(System.in);
//        System.out.println("Enter your Grade: ");
//        String choice = "y";
//        while(choice.equalsIgnoreCase("y")) {
//            int integerNext = grade.nextInt();
//
//            if (integerNext >= 0 && integerNext < 60) {
//                System.out.println("Your Grade of " + integerNext + " is an F");
//            }
//            else if (integerNext >= 60 && integerNext < 67) {
//                System.out.println("Your Grade of " + integerNext + " is a C");
//            } else if (integerNext >= 67 && integerNext < 80) {
//                System.out.println("Your Grade of " + integerNext + " is a C");
//            } else if (integerNext >= 80 && integerNext < 88) {
//                System.out.println("Your Grade of " + integerNext + " is a B");
//            } else if (integerNext >= 88 && integerNext <= 100) {
//                System.out.println("Your Grade of " + integerNext + " is an A");
//            }
//
//        }
//        System.out.print("Continue? (y/n): ");
//        choice = grade.next();
//        System.out.println();


    }
}

