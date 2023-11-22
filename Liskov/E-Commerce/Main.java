public class Main {
    public static void main(String[] args) {
        PremiumUser premiumUser = new PremiumUser();
        StandardUser standardUser = new StandardUser();

        Product product1 = new Product("Umbrella", 100);
        Product product2 = new Product("Telephone", 7000);

        premiumUser.addToCart(product1);
        premiumUser.addToCart(product2);
        
        standardUser.addToCart(product1);
        standardUser.addToCart(product2);

        premiumUser.pay();
        standardUser.pay();
    }
}
