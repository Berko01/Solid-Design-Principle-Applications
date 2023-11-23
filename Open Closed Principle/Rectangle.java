public class Rectangle implements Area,Environment {

    public Rectangle(double edge) {
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
