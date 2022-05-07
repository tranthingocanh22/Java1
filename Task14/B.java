public class B extends A{
    public B(){
        super();
        System.out.println("Constrycted an instance of B");
    }

    @Override
    public String toString() {
        return "This is B";
    }
}
