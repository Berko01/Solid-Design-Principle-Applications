import java.util.ArrayList;

public class AreaPanel {
   
    public double calculate(ArrayList<Area> shapes) {
        double result = 0;
        for (Area shape : shapes) {
            if(shape instanceof Area)
                result += shape.calculateArea();
        }
        return result;
    }







}
