public class VeriTabani implements IVeritabani {

    private static VeriTabani instance;
    
    private VeriTabani() {
        // private constructor to prevent instantiation outside the class
    }
    @Override
    public void kullaniciKaydet(Kullanici kullanici) {
      
   
    }

    @Override
    public void urunKaydet(Urun urun) {
       
       
    }

    @Override
    public void odemeKaydet(Odeme odeme) {

  
    }

    

    
    public static IVeritabani getInstance() {
        if (instance == null) {
            instance = new VeriTabani();
        }
        return instance;
    }
    @Override
    public void uruncikar(Urun urun) {

    }
    
}
