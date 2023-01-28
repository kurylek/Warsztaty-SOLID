package ISP.BadApproach;

public class Penguin implements IMoving {

    @Override
    public void run() {
        System.out.println("I can run!");
    }

    @Override
    public void swim() {
        System.out.println("I can swim!");
    }

    @Override
    public void fly() {
        throw new RuntimeException("I can't fly!");
    }
}
