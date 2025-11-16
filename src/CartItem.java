public class CartItem {
    private double product;
    private int quantity;
    private int id;
    String name;

    public CartItem(double product, int quantity, int id, String name) {
        this.product = product;
        this.quantity = quantity;
        this.id = id;
        this.name = name;
    }

    public CartItem(double product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getSubtotal() {
        return product * quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {}
    @Override
    public String toString() {
        return product + " | Say: " + quantity + " | Cəmi: " + getSubtotal() + " AZN";
    }
}
