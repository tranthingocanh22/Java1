public class Noi extends Dogiadung{
    private String color;
    public Noi(String id, String name, double price, int qty,String color){
        super(id, name, price, qty);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Noi{" +
                "color='" + color + '\'' +
                '}';
    }
}
