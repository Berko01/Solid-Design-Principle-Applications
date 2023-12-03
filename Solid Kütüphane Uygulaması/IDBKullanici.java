import java.util.ArrayList;

public interface IDBKullanici {
    public void kullaniciEkle(ArrayList<String> kullaniciBilgi);
    public void kullaniciSil(ArrayList<String> kullaniciBilgi);
    public ArrayList<String> kullaniciAra(String isim);
}
