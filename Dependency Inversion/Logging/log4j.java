public class log4j implements ILog {

    String message;
    public log4j(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return message;
    }


}
