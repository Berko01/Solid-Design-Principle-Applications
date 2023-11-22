abstract class Car {
    public Car(double speed) {
        this.speed = speed;
    }

    public double speed;

    public void speedUp(Double speedAmount) {
        // TODO Auto-generated method stub

        this.speed += speedAmount;

    }

    public void startCar() {
        System.out.println("Araba çalıştırıldı");
        this.speed = 0;
    }

    public void slowDown(int reductionPercentage) {
        double reductionFactor = 1.0 - (reductionPercentage / 100.0);
        int newSpeed = (int) (speed * reductionFactor);
        this.speed = newSpeed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
