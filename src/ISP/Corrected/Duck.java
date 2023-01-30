package ISP.Corrected;

public class Duck implements IRunning, ISwimming, IFlying {

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
        System.out.println("I can fly!");
    }
}
