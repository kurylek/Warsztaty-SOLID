package ISP.Corrected;

public class Penguin implements IRunning, ISwimming {

    @Override
    public void run() {
        System.out.println("I can run!");
    }

    @Override
    public void swim() {
        System.out.println("I can swim!");
    }
}
