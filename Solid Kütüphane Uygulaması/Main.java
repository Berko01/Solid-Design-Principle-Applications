import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Kitap kitap = new Kitap();
        kitap.adiGir("Seker Portakali");
        kitap.isbnGir(1221245);
        kitap.kitaplikKoduGir("TA-24");
        kitap.materyalTipiGir("kitap");

        IDBMateryal dbm = new MsSqlMateryal();
        dbm.materyalEkle(kitap);
        dbm.materyalSil(kitap);
        dbm.materyalAra("Gulliver'in Gezileri");

        System.out.println("\n ---------------- \n");
        
        EKitap eKitap = new EKitap();
        eKitap.adiGir("Suc ve Ceza");
        eKitap.webAdresiGir("www.ekitapadresi.com/sucveceza.pdf");
        eKitap.materyalTipiGir("e-kitap");

        dbm = new MsSqlMateryal();
        dbm.materyalEkle(eKitap);
        dbm.materyalSil(eKitap);
        dbm.materyalAra("Donusum");

        IKullanici kull = new Ogrenci();
        kull.kullaniciBilgiGir("ogrenciMehmet", "Mehmet Turgut", "ogrenci", "1923");

        IDBKullanici msKul = new MsSqlKullanici();

        ArrayList<String> kBilgi = kull.kullaniciBilgiGetir();
        msKul.kullaniciEkle(kBilgi);
        msKul.kullaniciSil(kBilgi);
        msKul.kullaniciAra("Ali Veli");

        System.out.println("\n ---------------- \n");

        kull = new Yonetici();
        kull.kullaniciBilgiGir("yoneticiAhmet", "Ahmet Demir", "yonetici", "2345");
        
        ArrayList kBilgi2 = kull.kullaniciBilgiGetir();
        msKul.kullaniciEkle(kBilgi2);
        msKul.kullaniciSil(kBilgi2);
        msKul.kullaniciAra("Zeynep Deneme");


    }

    
}
