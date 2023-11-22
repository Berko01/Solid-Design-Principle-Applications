public class Main {

    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari(0);
        BMW bmw = new BMW(0);
        Mercedes mercedes = new Mercedes(0);

        
        ferrari.startCar();
        ferrari.speedUp(50.0);
        ferrari.turnOnTurbo();
        System.out.println(ferrari.getSpeed());

        bmw.startCar();
        bmw.speedUp(50.0);
        bmw.turnOnTheAirConditioner();
        System.out.println(bmw.getSpeed());

    
        mercedes.startCar();
        mercedes.speedUp(50.0);
        mercedes.turnOnTurbo();
        mercedes.turnOnTheAirConditioner();
        mercedes.speedUp(50.0);
        System.out.println(mercedes.getSpeed());

        
    }
    
}
