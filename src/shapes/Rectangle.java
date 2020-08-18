package shapes;

public class Rectangle {
    protected int perimeter;
    protected int area;
    protected int width;
    protected int length;
    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }
    public int getPerimeter(){
        return 2 * (length + width);
    }
    public int getArea(){
        return length * width;
    }
}
