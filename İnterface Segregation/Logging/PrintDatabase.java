public class PrintDatabase implements IConnection, IPrint{

    IDatabase database;

    public PrintDatabase(IDatabase database) {
        this.database = database;
    }


    @Override
    public void print(ILog log) {
        openConnection();
        System.out.println("Loglama yapildi");
        closeConnection();
    }

    @Override
    public void openConnection() {
        // TODO Auto-generated method stub
        System.out.println("Baglanti kuruldu.");
    }

    @Override
    public void closeConnection() {
        // TODO Auto-generated method stub
        System.out.println("Baglanti koparildi.");
    }

    
}