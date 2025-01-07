package workshop7;


import java.util.ArrayList;
import java.util.HashMap;

/**
 * Main class to demonstrate the E-Commerce Shopping Cart System.
 */
public class Qno2 {
    public static void main(String[] args) {
        // Creating objects
        Customer customer = new Customer("C001", "Alice", "alice@example.com", "password123");
        Product product1 = new Product("P001", "Laptop", 1200.00, 10);
        Product product2 = new Product("P002", "Headphones", 50.00, 30);
        ShoppingCart cart = new ShoppingCart();

        // Creating product list
        ArrayList<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        // Customer operations
        customer.register();
        customer.login();
        System.out.println("Available Products:");
        customer.viewProducts(products);

        customer.addToCart(cart, product1, 1);
        customer.addToCart(cart, product2, 2);

        System.out.println("Cart Items:");
        cart.viewCartItems();

        customer.checkout(cart);
    }
}

/**
 * Class representing a customer in the E-Commerce system.
 */
class Customer {
    private String customerId;
    private String name;
    private String email;
    private String password;

    /**
     * Constructor to initialize a customer.
     *
     * @param customerId Customer ID
     * @param name       Customer's name
     * @param email      Customer's email
     * @param password   Customer's password
     */
    public Customer(String customerId, String name, String email, String password) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    /**
     * Simulates customer registration.
     */
    public void register() {
        System.out.println(name + " has registered successfully.");
    }

    /**
     * Simulates customer login.
     */
    public void login() {
        System.out.println(name + " has logged in.");
    }

    /**
     * Displays available products to the customer.
     *
     * @param products List of products
     */
    public void viewProducts(ArrayList<Product> products) {
        for (Product product : products) {
            product.getDetails();
        }
    }

    /**
     * Adds a product to the customer's shopping cart.
     *
     * @param cart     The shopping cart
     * @param product  The product to be added
     * @param quantity The quantity of the product
     */
    public void addToCart(ShoppingCart cart, Product product, int quantity) {
        cart.addProduct(product, quantity);
    }

    /**
     * Proceeds to checkout and calculates the total price of the shopping cart.
     *
     * @param cart The shopping cart
     */
    public void checkout(ShoppingCart cart) {
        cart.calculateTotalPrice();
        System.out.println("Total amount: $" + cart.getTotalPrice());
    }
}

/**
 * Class representing a product in the E-Commerce system.
 */
class Product {
    private String productId;
    private String name;
    private double price;
    private int stockQuantity;

    /**
     * Constructor to initialize a product.
     *
     * @param productId     Product ID
     * @param name          Product name
     * @param price         Product price
     * @param stockQuantity Stock quantity
     */
    public Product(String productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    /**
     * Displays the details of the product.
     */
    public void getDetails() {
        System.out.println("Product ID: " + productId + ", Name: " + name +
                ", Price: $" + price + ", Stock: " + stockQuantity);
    }

    /**
     * Checks if the product is available in the desired quantity.
     *
     * @param quantity Desired quantity
     * @return true if available, false otherwise
     */
    public boolean checkAvailability(int quantity) {
        return stockQuantity >= quantity;
    }

    /**
     * Reduces the stock of the product by the specified quantity.
     *
     * @param quantity Quantity to reduce
     */
    public void reduceStock(int quantity) {
        stockQuantity -= quantity;
    }

    /**
     * Gets the product's name.
     *
     * @return Product name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the product's price.
     *
     * @return Product price
     */
    public double getPrice() {
        return price;
    }
}

/**
 * Class representing a shopping cart.
 */
class ShoppingCart {
    private HashMap<Product, Integer> cartItems = new HashMap<>();
    private double totalPrice;

    /**
     * Adds a product to the shopping cart.
     *
     * @param product  Product to be added
     * @param quantity Quantity of the product
     */
    public void addProduct(Product product, int quantity) {
        if (product.checkAvailability(quantity)) {
            cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
            product.reduceStock(quantity);
            System.out.println(quantity + " " + product.getName() + "(s) added to cart.");
        } else {
            System.out.println("Insufficient stock for " + product.getName());
        }
    }

    /**
     * Displays the items in the shopping cart.
     */
    public void viewCartItems() {
        cartItems.forEach((product, quantity) ->
                System.out.println("Product: " + product.getName() + ", Quantity: " + quantity));
    }

    /**
     * Calculates the total price of the shopping cart.
     */
    public void calculateTotalPrice() {
        totalPrice = cartItems.entrySet().stream()
                .mapToDouble(entry -> entry.getKey().getPrice() * entry.getValue())
                .sum();
    }

    /**
     * Gets the total price of the shopping cart.
     *
     * @return Total price
     */
    public double getTotalPrice() {
        return totalPrice;
    }
}
