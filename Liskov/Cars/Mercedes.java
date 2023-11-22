public class Mercedes extends Car implements IWithAirConditioned,IWithTurbo{

    public Mercedes(int speed) {
        super(speed);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void turnOnTurbo() {
        setSpeed(getSpeed()*2);
    }

    @Override
    public void turnOnTheAirConditioner() {
        setSpeed(0.9*getSpeed());
    }






    
}
