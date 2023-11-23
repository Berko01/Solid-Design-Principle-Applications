import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5);
        Circle circle = new Circle(2);

        AreaPanel areaPanel = new AreaPanel();
        EnvironmentPanel environmentPanel = new EnvironmentPanel();

        ArrayList<Environment> shapesEnviroment = new ArrayList<>();
        ArrayList<Area> shapesArea = new ArrayList<>();

        shapesEnviroment.add(circle);
        shapesEnviroment.add(square);
        shapesEnviroment.add(rectangle);

        
        shapesArea.add(circle);
        shapesArea.add(square);
        shapesArea.add(rectangle);



        double totalArea = areaPanel.calculate(shapesArea);
        double totalEnvironment = environmentPanel.calculate(shapesEnviroment);

        System.out.println(totalArea);
        System.out.println(totalEnvironment);


        
    }
    
}
