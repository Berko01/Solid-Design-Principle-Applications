public class Giris {

    public Giris() {
        this.veritabani = VeriTabani.getInstance();
    }

    IVeritabani veritabani;

    public Giris(IVeritabani veritabani) {
        this.veritabani = VeriTabani.getInstance();
    }

    public boolean girisKontrol(String email, String sifre) {

        if (email.equals("sefa@ktu.edu.tr") && sifre.equals("123456")
                || email.equals("sefaaras@ktu.edu.tr") && sifre.equals("123456")) {

            return true;
        }
        return false;

    }
}
