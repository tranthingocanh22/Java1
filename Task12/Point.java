public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY() {
        int arr[] = new int [2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "(" + x +"," + y + ")";
    }
    public double distance(int x, int y) {
        return Math.sqrt((x-this.x)*(x-this.x) + (y - this.y) * (y - this.y) );
    }
    public double distance(Point another) {
        return Math.sqrt((another.x-this.x)*(another.x-this.x) + (another.y - this.y) * (another.y - this.y) );
    }
    public double distance() {
        return distance(0,0);
    }

}