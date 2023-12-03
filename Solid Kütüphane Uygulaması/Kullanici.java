public abstract class Kullanici implements IKullanici {
    private String kullaniciAdi;
    private String adSoyad;
    private String kullaniciTuru;
    
    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }
    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }
    public void setKullaniciTuru(String kullaniciTuru) {
        this.kullaniciTuru = kullaniciTuru;
    }
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }
    public String getAdSoyad() {
        return adSoyad;
    }
    public String getKullaniciTuru() {
        return kullaniciTuru;
    }

}
