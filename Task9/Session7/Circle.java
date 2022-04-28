class Circle extends Shape {
    float area;

    @Override
    void calculate(float rad) {
        area=getPI()*rad*rad;
        System.out.println("Area of Circle is: "+area);
    }
    class Rectangle extends Shape{
        float perimeter;
        float length=10;
    }
    void calculate(float width){
        perimeter=2*(length+width);
        System.out.println("Perimeter of Rectangle is: "+ perimeter);
    }
}