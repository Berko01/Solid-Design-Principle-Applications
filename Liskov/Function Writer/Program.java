public class Program {
    public static void main(String[] args) {

        //Printer Process kullanırsak printer process içinde bir if kontrolü yapmamız gerekir.
        PrinterProcess p = new PrinterProcess(new Writer1());
        p.print();
        p.scan();

        p = new PrinterProcess(new Writer2());
        p.print();
        p.scan();




        


    }
}
