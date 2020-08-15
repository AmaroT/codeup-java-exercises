//import java.lang.reflect.Method;
//import java.util.Scanner;
//
////public class MethodsExercises
////{
////    int addition(int num1, int num2) {
////        return num1 + num2;
////    }
////    int subtract(int num1, int num2) {
////        return num1 - num2;
////    }
////    int multiply(int num1, int num2) {
////        return num1  * num2;
////    }
////    int divide(int num1, int num2){
////        return num1 / num2;
////    }
////    int modulus(int num1, int num2){
////        return num1 % num2;
////    }
////    // Function to Divide two numbers of x and y
////    int multiply2(int x, int y) {
////        //0 by any int returns 0
////        if (y == 0)
////        return 0;
////        //Add x one by one
////        if (y > 0)
////        return (x + multiply2(x, y - 1));
////        // in the case where y is negative
////        if(y < 0)
////        return -multiply2(x,-y);
////        return -1;
////
////    }
//
//
////    public static void main(String[] args)
////    {
////        MethodsExercises obj = new MethodsExercises();
////        //This will call the Addition method
////        System.out.println("The Addition of the 5 and 20 is: "+obj.addition(5, 20));
////        //This will call Subtract method
////        System.out.println("The Substraction of 5 and 20 is: "+obj.subtract(5, 20));
////        //This will call Multiply method
////        System.out.println("The Multiplication of 5 and 20 is: "+obj.multiply(5,  20));
////        //This will call the Divide Method
////        System.out.println("The Divisor of the Division of 100 and 5: " +obj.divide(100, 5));
////        //This will call the Modulus Method
////        System.out.println("The Modulus of Modulo of 55 and 11 is: " +obj.modulus(55, 10));
////        //   Bonus
////        //   Create your multiplication method without the * operator (Hint: a loop might be helpful).
////        System.out.println("\nThe Multiplication Method without the * operator is: " + obj.multiply2(5,-11));
//
//
////    }
////}
//
//public class MethodsExercises {
////    public static void main(String[] args) {
////        //Call Methods here, once they are written
////
////        //addition
////        System.out.println("Testing 2 + 5 = "+ add(2,5));
////        //Substraction
////        System.out.println("Testing 5 - 1 = "+ subtract(5,1));
////        //Mulitplication
////        System.out.println("Testing 2 * 5 = "+ multiply(2,5));
////        //Division
////        System.out.println("Testing 10 / 5 = "+ divide(10,5));
//////        System.out.println("Testing 49 / 0 = "+ divide(49,0));
////        System.out.println("Testing out 7 % 2= "+ modulus(7,2));
////    }
////    public static int add(int a, int b){
////        return a + b;
////    }
////    public static int subtract(int a, int b){
////        return a - b;
////    }
////    public static int multiply(int a, int b){
////        return a * b;
////    }
////    public static int divide(int a , int b) throws ArithmeticException {
////        if(b == 0) {
////            throw new ArithmeticException("You tried to divide by Zero");
////        }
////        return a / b;
////    }
////    public static int modulus(int a, int b){
////        if(b == 0){
////            throw new ArithmeticException("You tried to divide by Zero");
////        }
////        return a % b;
////    }
////    public static int multiplyRecursively(int a, int b){
////        int product = 0;
////        if( a > 0){
////            product = b + multiplyRecursively( a- 1, b);
////        } else if ( a < 0) {
////            product = (0 - b) + multiplyRecursively(a + 1, b);
////        }
////        return product;
////    }
//        //check if input is within range
//        public static int getInteger(int min, int max){
//            // i.e. see if number is between 1 and 10
//
//            Scanner sc = new Scanner(System.in);
//
//            boolean doAgain = true;
//            int num = 0;
//            do {
//                num = sc.nextInt();
//                if( num < min || num > max ) {
//                    System.out.printf("\nThe integer %d is out of range\n",num);
//                    System.out.printf("Enter an integer between %d and %d: ",min, max);
//                } else {
//                    doAgain = false; // they did enter a number within range, so break while
//                }
//            } while(doAgain); // if we get a correct number (1 < x < 10), break out of while
//            return num;
//        }
//        public static long factorial(int num) throws ArithmeticException {
//            //factorial(5) = 5* 4 * 3 * 2 * 1
//            int factorial = 1;
//            int previousFactorial = 1;
//            for (int i = 1; i <= num; ++i) {
//                factorial = factorial * 1;
//                if (previousFactorial > factorial) {
//                    //part of bonus, to check if we have reached int overflow
//                    throw new ArithmeticException("The factorial of " + num +
//                            "is too large to be represented by a long value;" +
//                            "it broke at " + i);
//                }
//            }
//            return factorial;
//        }
//        //Dice Game
//
//        // Ask the user to enter the number of sides for a pair of dice.
//        // Prompt the user to roll the dice.
//        // "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//        // Use static methods to implement the method(s) that generate the random numbers.
//        // Use the .random method of the java.lang.Math class to generate random numbers.
//
//        //make a scanner
//        private static Scanner scanner;
//        public void setScanner (Scanner s){
//            scanner = s;
//        }
//        public static void diceGame() {
//            //Ask the user to enter the number of sides for a pair of dice.
//            System.out.println("How many sides will on each die? 1 - 20: ");
//            int numSides = getInteger(1, 20);
//            while (true) {
//                System.out.println("Hit enter to roll the dice, type 'exit' to exit: ");
//                String response = scanner.nextLine();
//                if (response.length() != 0) {
//                    break;//typed in 'exit' or otherwise - quit game
//                }
//                //they hit the enter key
//                //generate dice rolls for 2 die
//                int diceSum = 0;
//
//                //going to generate a random number between 1 and (numSides_
//                int diceValue1 = (int) (Math.random() * numSides) + 1;
//                int diceValue2 = (int) (Math.random() * numSides) + 1;
//                System.out.println("Dice 1: " + diceValue1);
//                System.out.println("Dice 2: " + diceValue2);
//                // 0 < x < 1 // * 20 0.0001 < 19.99999
//            }
//
//        }
//        public class HighLow {
//
//            public static void main(String[] args) {
//                Scanner scanner = new Scanner(System.in);
//                setScanner(scanner);
//
//                // Game picks a random number between 1 and 100.
//                int randomNum = (int)(Math.random()*100) + 1;
//
//                // Prompts user to guess the number.
//                int userGuess = 0;
//                int numberOfGuesses = 0;
//                while(true) {
//                    System.out.print("Please guess the random number: ");
//                    userGuess = scanner.nextInt();
//                    // All user inputs are validated.
//                    if( userGuess < 1 || userGuess > 100 ) {
//                        System.out.println("Your guess is out of the guessing bounds. Try again.");
//                    } else {
//                        // see if the validated guess was correct, too high, or too low
//                        String results = checkGuess(userGuess, randomNum); // 'higher', 'lower', 'You guessed correctly!'
//                        if (results.equals("You guessed correctly!")) {
//                            // they guessed correctly, so break out of the loop
//                            System.out.println(results);
//                            System.out.println("Took you " + numberOfGuesses + " guesses");
//                            break;
//                        } else {
//                            // they guessed too high/low, give them a hint, and continue
//                            //  looping
//                            System.out.println(results);
//                        }
//                    }
//                    numberOfGuesses++;
//                } // we now have a guess between 1 - 100
//
//            }
//
//            public static String checkGuess(int guess, int targetNum) {
//                // returns whether guess is:
//                if (guess == targetNum) {
//                    //   c) correct
//                    return "You guessed correctly!";
//                } else if(guess < targetNum) {
//                    //   a) too high
//                    return "Higher...";
//                } else if(guess > targetNum) {
//                    //   b) too low
//                    return "Lower...";
//                }
//                return "error";
//
//            }
////
////             If user's guess is less than the number, it outputs "HIGHER".
////             If user's guess is more than the number, it outputs "LOWER".
////             If a user guesses the number, the game should declare "GOOD GUESS!"
//
////             make a scanner
//            private static Scanner scanner;
//            public static void setScanner(Scanner s) {
//                scanner = s;
//            }
//        }
////    }
//
//



