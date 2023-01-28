package LSP.BadApproach;

public class Bow extends Weapon {

    public Bow() {
        super();
    }

    @Override
    public String cut() {
        throw new RuntimeException("I can't cut!");
    }
}
