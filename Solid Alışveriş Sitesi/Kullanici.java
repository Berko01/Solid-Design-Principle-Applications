public abstract class Kullanici {

    private String mail;
    private String sifre;

    public abstract void goruntule(Urun urun);

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
}