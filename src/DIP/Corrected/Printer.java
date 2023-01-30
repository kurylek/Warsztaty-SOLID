package DIP.Corrected;

public class Printer {

    private IColorModel colorModel;

    public Printer(IColorModel colorModel) {
        this.colorModel = colorModel;
    }

    public void colors() {
        colorModel.colors();
    }
}
