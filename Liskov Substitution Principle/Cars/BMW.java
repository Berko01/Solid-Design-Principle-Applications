public class BMW extends Car implements IWithAirConditioned{

    public BMW(int speed) {
        super(speed);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void turnOnTheAirConditioner() {
        setSpeed(getSpeed()*0.9);
    }



    
}
