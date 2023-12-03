import javax.xml.transform.Source;

public class Musteri extends Kullanici {

    
    String isim;
    String adres;
    private Sepet sepet;

    private IVeritabani veritabani;

    public Musteri(String isim, String email, String sifre, String adres) {
        this.isim = isim;
        this.sepet = new Sepet();
        this.adres = adres;

        veritabani = VeriTabani.getInstance();
    

        setMail(email);
        setSifre(sifre);
        
        
    }


    public Musteri() {
        this.sepet = new Sepet();
    }

    @Override
    public void goruntule(Urun urun) {
        System.out.println(urun.fiyat + " " + urun.adi);
    }

    public void urunEkle(Urun urun)
    {
        veritabani.urunKaydet(urun);
        System.out.println("Urun eklendi.");
    }

    public void urunCikar(Urun urun){
        veritabani.uruncikar(urun);
        System.out.println("Urun cikarildi.");
    }

    public void odemeYap(){
        double toplamTutar = 0;

        for(int i=0; i<sepet.getSepet().size();i++)
            toplamTutar += sepet.getSepet().get(i).fiyat;

        Odeme odeme = new Odeme(toplamTutar, this.isim);

        veritabani.odemeKaydet(odeme);

        System.out.println("Odeme kaydedildi.");

        
    }
    
}
