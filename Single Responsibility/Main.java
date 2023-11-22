public class Main {

    public static void main(String[] args) {
        User user = new User();

        user.setName("Beko");
        user.setEmail("beko@hotmail.com");

        Adress adress = new Adress();



        adress.setCity("Trabzon");
        adress.setDistrict("Of");

        user.setBillingAdress(adress);
        user.setCargoAdress(adress);


        Login login = new Login();

        login.login(user.getEmail(), "1234");;

        
        
    }

};