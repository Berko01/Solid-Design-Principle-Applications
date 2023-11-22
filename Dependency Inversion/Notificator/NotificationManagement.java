import java.util.ArrayList;

public class NotificationManagement {
    ArrayList<ISend> list;
    
    public NotificationManagement(){
        list = new ArrayList<>();
    }

    public void add(ISend send){
        list.add(send);
    }
    public ArrayList<ISend> getList(){
        return list;
    }


}
