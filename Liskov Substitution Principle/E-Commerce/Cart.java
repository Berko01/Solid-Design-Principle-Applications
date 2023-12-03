import java.util.ArrayList;
import java.util.List;

public class Cart{
    
    public List<Product> products = new ArrayList<>();

    public Double totalPrice(){
        double total = 0;
        for(Product product : products){
            total += product.price;
        }

        return total;
    }
    
}