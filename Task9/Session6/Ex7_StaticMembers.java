public class Ex7_StaticMembers {
    public static int staticCounter = 0;
    int instanceCounter = 0;
    static {
        System.out.println("I am a static block");
    }
    public static void staticMethod(){
        System.out.println("I am a static method");
    }
    public void displayCount(){
        staticCounter++;
        instanceCounter++;
        System.out.println("Static counter is: "+staticCounter);
        System.out.println("Instance counter is: "+instanceCounter);
    }

    public static void main(String[] args) {
        System.out.println("I am the main method");
        Ex7_StaticMembers.staticMethod();
        Ex7_StaticMembers objStatic1 = new Ex7_StaticMembers();
        objStatic1.displayCount();
        Ex7_StaticMembers objStatic2 = new Ex7_StaticMembers();
        objStatic2.displayCount();
        Ex7_StaticMembers objStatic3 = new Ex7_StaticMembers();
        objStatic3.displayCount();
    }
}
