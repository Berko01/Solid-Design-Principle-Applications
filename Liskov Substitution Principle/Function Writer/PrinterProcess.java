import javafx.scene.transform.Scale;

public class PrinterProcess {
    IFunctionalPrinter functionalPrinter;

    public PrinterProcess(IFunctionalPrinter functionalPrinter) {
        this.functionalPrinter = functionalPrinter;
    }


    public void print() {
        functionalPrinter.print();
    }

    public void scan() {
        if (functionalPrinter instanceof IPrinterThatCanScan) {
            ((IPrinterThatCanScan) functionalPrinter).scan();
        } else {
            System.out.println("Bu yazici tarama ozelligine sahip degil.");
        }
    }

    
}
