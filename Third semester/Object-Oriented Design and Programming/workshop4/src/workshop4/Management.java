package workshop4;

class Management {
    private String name;
    private double price;
    private int quantity;

    public Management(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

 
    public boolean isProductAvailable(String productName, int requestedQuantity) {
        if (this.name.equalsIgnoreCase(productName)) {
            return this.quantity >= requestedQuantity;
        }
        return false;
    }

}
