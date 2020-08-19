package shapes;

    public class Square extends Quadrilateral {
        public Square(int sides){
            super(sides, sides);
}
    @Override
        public void setLength(int length){
            this.length = length;
        }
    @Override
        public void setWidth(int width){
            this.width = length;
        }
    }