//package shapes;
//import java.util.Scanner;
//import util.Input;
//public class CircleApp {
//
//    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//        //Ask user to input circle radius
//        System.out.println("Enter the radius of a circle: ");
//        double radius = keyboard.nextDouble();
//
//        //close keyboard
//        keyboard.close();
//
//        //Create a Circle object passing in user input
//        CircleClass circleClass = new CircleClass();
//        Circle circle = circleClass.new Circle(radius);
//
//        //Display circle information
//        System.out.println("Area is " + circle.getArea());
//        System.out.println("Diameter is " + circle.getDiameter());
//        System.out.println("Circumference is " + circle.getCircumference());
//
//
//    }
//}
//    Input newInp = new Input();
//    int amtCircles = 0;
//        do{
//        double radius = newInp.getDouble();
//        Circle myCircle = new Circle(radius);
//        System.out.println(myCircle.getArea());
//        System.out.println(myCircle.getCircumference());
//        System.out.println("Would you like to make another circle?");
//        amtCircles++;
//    } while (newInp.yesNo());
//        System.out.println(amtCircles);
//
//}