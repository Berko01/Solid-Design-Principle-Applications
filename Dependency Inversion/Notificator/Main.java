public class Main{
    public static void main(String[] args) {

        User user1 = new User("Beko", "beko@gmail.com","1221312", "123123123124");
        SendViaIp sendViaIp= new SendViaIp();
        SendViaMail sendViaMail = new SendViaMail();

        user1.add(sendViaMail);
        user1.add(sendViaIp);

        SendNotification sendNotification = new SendNotification();
        sendNotification.sendNotification(user1, "Hello beko.");


    }
}