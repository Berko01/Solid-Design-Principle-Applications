public class Writer1 implements IFunctionalPrinter, IPrinterThatCanScan{

    @Override
    public void print() {
       System.out.println("Yazici1 yazdir.");
    }

    @Override
    public void scan() {
        System.out.println("Yazici1 Tara.");
    }



}
