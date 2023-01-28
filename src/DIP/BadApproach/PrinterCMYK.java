package DIP.BadApproach;

public class PrinterCMYK {

    private CMYK colorModel;

    public PrinterCMYK(CMYK colorModel) {
        this.colorModel = colorModel;
    }

    public void colors() {
        colorModel.colors();
    }
}
