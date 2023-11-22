public class PrintConsole implements IPrint {

    @Override
    public void print(ILog log) {
        System.out.println(log.getMessage());
    }
    
}
