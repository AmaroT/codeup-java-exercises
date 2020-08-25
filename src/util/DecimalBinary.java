package util;
import java.util.Scanner;

public class DecimalBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number, and it will be converted to Binary: ");
        int num = input.nextInt();

        //Calling Method toBinaryString()
        String str = Integer.toBinaryString(num);
        System.out.println("Your number in Binary is: " +str);
    }
}
