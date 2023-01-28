package ISP.BadApproach;

public class Fish implements IMoving {
    @Override
    public void run() {
        throw new RuntimeException("I can't run!");
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
