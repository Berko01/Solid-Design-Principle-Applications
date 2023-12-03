public class Main {
    public static void main(String[] args) {
        IVeritabani veriTabani = VeriTabani.getInstance();
        Giris giris = new Giris();

        Satici satici = new Satici("Aras", "sefaaras@ktu.edu.tr", "123455", "FirmaAdres");
        Musteri musteri = new Musteri("Hakan Bozkurt", "hakanbozkurt@ktu.edu.tr", "654321", "Ev Adres");
        veriTabani.kullaniciKaydet(musteri);
        veriTabani.kullaniciKaydet(satici);

        Urun bilgisayar = new Urun(satici, "Bilgisayar", 7500.0);
        Urun telefon = new Urun(satici, "Telefon", 5000.0);
        Urun tablet = new Urun(satici, "Tablet", 2500.0);
        satici.kaydet(bilgisayar);

        satici.goruntule(bilgisayar);
        musteri.goruntule(telefon);

        if (giris.girisKontrol("sefa@ktu.edu.tr", "123456")) {
            System.out.println("Giriş Basarili");
        } else {
            System.out.println("Giriş Başarisiz");
        }
        if (giris.girisKontrol("sefaaras@ktu.edu.tr", "123456")) {
            System.out.println("Giriş Başarili");
        } else {
            System.out.println("Giriş Başarisiz");
        }

        musteri.urunEkle(tablet);
        musteri.urunEkle(bilgisayar);
        musteri.urunCikar(tablet);
        musteri.urunEkle(telefon);
        musteri.odemeYap();
    }
}
