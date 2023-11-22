public class SendViaIp implements ISend{

    @Override
    public void send(String message, User user) {
       System.out.println(user.ip + "'sine gonderildi. \nMesaj: " + message);
    }
    
}
