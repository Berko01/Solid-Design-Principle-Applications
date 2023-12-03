public abstract class User {
    Cart cart = new Cart();

    public abstract void addToCart(Product product);

    public double totalPrice(){

        
        return cart.totalPrice();
    }

    
}
