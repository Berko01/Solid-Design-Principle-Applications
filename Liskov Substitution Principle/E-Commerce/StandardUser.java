public class StandardUser extends User {

    @Override
    public void addToCart(Product product) {

        this.cart.products.add(product);
        
        
    }

    public void pay(){

        System.out.println(this.cart.totalPrice()); 
    }
   
}
