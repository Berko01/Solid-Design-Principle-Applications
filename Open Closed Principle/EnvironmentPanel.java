import java.util.ArrayList;

public class EnvironmentPanel {

    public double calculate(ArrayList<Environment> shapes) {
        double result = 0;
        for (Environment environment : shapes) {
            result += environment.calculateEnvironment();
        }
        return result;
    }
}
