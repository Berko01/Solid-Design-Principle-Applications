public class User{
    private String name;
   
    private String email;
    private String dateOfBirth;

    private Adress billingAdress;
    private Adress cargoAdress;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Adress getBillingAdress() {
        return billingAdress;
    }
    public void setBillingAdress(Adress billingAdress) {
        this.billingAdress = billingAdress;
    }
    public Adress getCargoAdress() {
        return cargoAdress;
    }
    public void setCargoAdress(Adress cargoAdress) {
        this.cargoAdress = cargoAdress;
    }


  
}