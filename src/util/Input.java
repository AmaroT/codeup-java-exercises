package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public String getString(){
        String response = scanner.nextLine();
        return response;
   }
   public String getString(boolean prompt){
       System.out.print("Enter a String: ");
       return getString();
   }
   public String getString(String prompt){
       System.out.print(prompt);
       return getString();
   }
   public boolean yesNo(){
        String s = this.scanner.nextLine();
        return "y".equalsIgnoreCase(s) || "yes".equalsIgnoreCase(s);
   }
   public boolean yesNo(boolean prompt){
       System.out.println("(Yes/No): ");
       return yesNo();
   }
   public int getInt(){
        try{
            return Integer.parseInt(this.scanner.nextLine());
        }catch(NumberFormatException e){
            System.out.print("Invalid Input, Try Again: ");
            return getInt();
        }
   }
   public int getInt(boolean prompt){
       System.out.println("Enter an Integer: ");
       return getInt();
   }
   public int getInt(String prompt){
       System.out.println(prompt);
       return getInt();
   }
   public int getInt(int min, int max) {
        int n = getInt();
        return (n >= min && n <= max) ? n : getInt(min, max);
   }
   public int getInt(int min, int max, boolean prompt){
       System.out.printf("Enter an Integer between %d and %d: ",min, max);
       return getInt(min, max);
   }
   public int getInt(int min, int max, String prompt) {
       System.out.printf(prompt, min, max);
       return getInt(min, max);
   }
   public double getDouble() {
        try {
            return Double.parseDouble(this.scanner.nextLine());
        } catch(NumberFormatException e){
            System.out.println("Invalid Input, Try Again: ");
            return getDouble();
        }
   }
   public double getDouble(boolean prompt){
       System.out.println("Enter a Double: ");
       return getDouble();

   }
   public double getDouble(String prompt){
       System.out.println(prompt);
       return getDouble();

   }
   public double getDouble(double min, double max){
        double n = getDouble();
        return ( n >= min && n <= max) ? n: getDouble(min, max);
   }
   public double getDouble(double min, double max, boolean prompt){
       System.out.printf("Enter a Double between %f and %f: ",min,max);
       return getDouble();
   }
   public double getDouble(double min, double max, String prompt){
       System.out.printf(prompt, min, max);
       return getDouble();
   }
   public int getBinary(){
        try{
            System.out.println("Enter a binary Number: ");
            return Integer.valueOf(this.scanner.nextLine(), 2);
        }catch(NumberFormatException e) {
            System.out.println("Invalid Binary, try again: ");
            return getBinary();
       }
    }
    public Input(){
        this.scanner = new Scanner(System.in);
    }
}
