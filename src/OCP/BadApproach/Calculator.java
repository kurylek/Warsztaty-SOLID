package OCP.BadApproach;

public class Calculator {

    public static double calculateArea(Object shape) {

        if (shape instanceof Square square) {
            return square.getA() * square.getA();
        } else if (shape instanceof Rectangle rectangle) {
            return rectangle.getA() * rectangle.getB();
        }

        return 0;
    }
}
