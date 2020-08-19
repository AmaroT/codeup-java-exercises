package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;
    public Quadrilateral() {};

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    @Override
    public double getPerimeter(){
        return 2 * (length + width);
    }
    @Override
    public double getArea() {
        return length * width;
    }
    public abstract void setLength(int length);
    public abstract void setWidth(int width);
}
