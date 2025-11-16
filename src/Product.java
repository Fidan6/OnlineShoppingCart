public class Product {
    private int id;
    private String name;
    private double price;
    private int total;

    public Product(int id, String name, double price, int total) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.total = total;
    }

    public Product(int i, String laptop, int i1) {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getTotal() {
        return total+=price;
    }

    @Override
    public String toString() {
        return id + ". " + name + " - " + price + " AZN";
    }
}


