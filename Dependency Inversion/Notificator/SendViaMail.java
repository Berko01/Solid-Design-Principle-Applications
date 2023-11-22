public class SendViaMail implements ISend {



    @Override
    public void send(String message, User user) {
        System.out.println(user.mail + " adresine mail yollandi. \nMesaj: " + message);
    }
    
}
