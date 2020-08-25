import util.Input;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();
//        boolean booleanTest = input.yesNo();
//        System.out.println(booleanTest);
        int intTest = input.getInt();
        System.out.println(intTest);
//        int minMax = input.getInt(1, 10);
//        System.out.println(minMax);
        double doubleTest = input.getDouble();
        System.out.println(doubleTest);
//        double minMaxDouble = input.getDouble(3.5, 10.5);
//        System.out.println(minMaxDouble);
    }

}