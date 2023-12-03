import java.util.ArrayList;

public class Yonetici extends Kullanici{
    String sicilNo;

    @Override
    public void kullaniciBilgiGir(String kullaniciAdi, String adSoyad, String kullaniciTipi, String no) {
    
        setAdSoyad(adSoyad);
        setKullaniciAdi(kullaniciAdi);
        setKullaniciTuru(kullaniciTipi);
        setSicilNo(no);
    }

    @Override
    public ArrayList<String> kullaniciBilgiGetir() {

        ArrayList<String> kullaniciBilgileri = new ArrayList<>();

        kullaniciBilgileri.add(getSicilNo());
        kullaniciBilgileri.add(getAdSoyad());
        kullaniciBilgileri.add(getKullaniciTuru());
        kullaniciBilgileri.add(getKullaniciAdi());
        return kullaniciBilgileri;

    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }
    
    
}
