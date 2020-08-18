package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        box1.getArea();
        box1.getPerimeter();
        System.out.println("The Perimeter of box 1 is: " + box1.getPerimeter());
        System.out.println("The Area of box 1 is: " + box1.getArea());
        Rectangle box2 = new Square(5);
        box2.getPerimeter();
        box2.getArea();
        System.out.println("The Area of the box 2 is: " + box2.getArea());
        System.out.println("The Perimeter of box 2 is: " + box2.getPerimeter());
    }
}
