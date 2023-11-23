public class Circle implements Environment, Area {

    public Circle(double radius) {
        this.radius = radius;
    }

    private double radius;

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateEnvironment() {
        return 2 * Math.PI * radius;

    }

}
