package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myshape;
        myshape = new Square(5);
        System.out.println(myshape.getPerimeter());
        System.out.println(myshape.getArea());

        myshape = new Rectangle(20,10);
        System.out.println(myshape.getArea());
        System.out.println(myshape.getPerimeter());

    }
}
