public class MsSqlMateryal implements IDBMateryal  {

    @Override
    public void materyalEkle(Materyal matertal) {
        
        System.out.println("Materyal eklendi.");
    }

    @Override
    public void materyalSil(Materyal materyal) {
       
        System.out.println("Materyal silindi.");
    }

    @Override
    public void materyalAra(String materyalAd) {
        
       System.out.println("Materyal arandi.");

       

    }
    
}
