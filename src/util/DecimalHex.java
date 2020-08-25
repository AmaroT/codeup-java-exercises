package util;
import java.util.Scanner;
public class DecimalHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Decimal number to be converted to Hex: ");
        int num = input.nextInt();

        //Calling Method toHexString()
        String str = Integer.toHexString(num);
        System.out.println("Your Entered Decimal Value to Hexadecimal is: " +str);
    }
}
