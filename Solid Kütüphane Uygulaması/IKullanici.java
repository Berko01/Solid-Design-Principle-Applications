import java.util.ArrayList;

public interface IKullanici {
    void kullaniciBilgiGir(String kullaniciAdi, String adSoyad, String kullaniciTipi ,String no);
    ArrayList<String> kullaniciBilgiGetir();
    
}