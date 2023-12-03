import java.util.ArrayList;

public class Ogrenci extends Kullanici {

    private String okulNo;

    @Override
    public void kullaniciBilgiGir(String kullaniciAdi, String adSoyad, String kullaniciTipi, String no) {
       
        this.okulNo = okulNo;
        setAdSoyad(adSoyad);
        setKullaniciAdi(kullaniciAdi);
        setKullaniciTuru(kullaniciTipi);
        
    }

    @Override
    public ArrayList<String> kullaniciBilgiGetir() {
        
       
        ArrayList<String> kullaniciBilgileri = new ArrayList<>();

        kullaniciBilgileri.add(getOkulNo());
        kullaniciBilgileri.add(getAdSoyad());
        kullaniciBilgileri.add(getKullaniciTuru());
        kullaniciBilgileri.add(getKullaniciAdi());
        return kullaniciBilgileri;
    }

    public String getOkulNo() {
        return okulNo;
    }
    
}
