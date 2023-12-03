import java.util.ArrayList;

public class MsSqlKullanici implements IDBKullanici{

    @Override
    public void kullaniciEkle(ArrayList<String> kullaniciBilgi) {
        
        System.out.println("Kullanici eklendi.");
    }

    @Override
    public void kullaniciSil(ArrayList<String> kullaniciBilgi) {

        System.out.println("Kullanici silindi");
    }

    @Override
    public ArrayList<String> kullaniciAra(String isim) {

        System.out.println("Kullanici arandi.");

        return new ArrayList<String>();
    }


    
}
