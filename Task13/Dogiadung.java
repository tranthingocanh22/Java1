public class Dogiadung {
    private String id;
    private String name;
    private double price;
    private int qty;

    public Dogiadung(String id, String name, double price , int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;

    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dogiadung{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}