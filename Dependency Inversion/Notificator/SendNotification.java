public class SendNotification {
    public void sendNotification(User user, String Message){
        for(ISend notification:user.getList()){
            notification.send(Message, user);
        }

    }
}
