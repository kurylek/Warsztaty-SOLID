package DIP.BadApproach;

public class PrinterRGB {

    private RGB colorModel;

    public PrinterRGB(RGB colorModel) {
        this.colorModel = colorModel;
    }

    public void colors() {
        colorModel.colors();
    }
}
