public class Ferrari extends Car implements IWithTurbo {

    public Ferrari(int speed) {
        super(speed);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void turnOnTurbo() {
        setSpeed(getSpeed()*2);
    }



    


}