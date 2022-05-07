public class Bat extends Dogiadung {
    private int size;

    public Bat(String id, String name, double price, int qty, int size) {
        super(id, name, price, qty);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bat{" +
                "size='" + size + '\'' +
                '}';
    }
}