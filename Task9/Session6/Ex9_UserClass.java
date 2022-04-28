import java.util.ArrayList;

public class Ex9_UserClass {
    ArrayList myCart = new ArrayList();
    public void createList(){
        myCart.add("Doll");
        myCart.add("Bus");
        myCart.add("Teddy");
        System.out.println("Cart contents are: "+myCart);
    }

    public static void main(String[] args) {
        Ex9_UserClass objUser = new Ex9_UserClass();
        objUser.createList();
        Ex7_StaticMembers objStatic = new Ex7_StaticMembers();
        objStatic.displayCount();
    }
}
