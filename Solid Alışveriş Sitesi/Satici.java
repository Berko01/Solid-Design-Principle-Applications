public class Satici extends Kullanici {
    String firmaAdi;
    String firmaAdresi;
    IVeritabani veritabani;
    
    
    public Satici(String firmaAdi, String mail, String sifre ,String firmaAdresi) {
        this.firmaAdi = firmaAdi;
        this.firmaAdresi = firmaAdresi;
        this.veritabani = VeriTabani.getInstance();
        setMail(mail);
        setSifre(sifre);
    }

    @Override
    public void goruntule(Urun urun) {
        
        System.out.println(urun.fiyat + " " + urun.adi + " " + urun.satici.firmaAdi + " "+ urun.satici.firmaAdresi);
    }

    public void kaydet(Urun urun){
        veritabani.urunKaydet(urun);
        System.out.println("Urun kaydedildi.");
    }
    


}
