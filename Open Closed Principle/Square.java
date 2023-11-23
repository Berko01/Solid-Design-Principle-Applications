public class Square implements Area, Environment {

    public Square(double edge) {
        this.edge = edge;
    }

    double edge;

    @Override
    public double calculateEnvironment() {

        return 4 * edge;
    }

    @Override
    public double calculateArea() {
        return Math.pow(edge, 2);

    }

}
