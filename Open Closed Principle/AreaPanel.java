import java.util.ArrayList;

public class AreaPanel {
   
    public double calculate(ArrayList<Area> shapes) {
        double result = 0;
        for (Area area : shapes) {
            result += area.calculateArea();
        }
        return result;
    }







}
