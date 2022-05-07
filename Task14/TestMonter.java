public class TestMonter {
    public static void main(String[] args) {
        Monter m1 = new FireMonter("r2u2");
        Monter m2 = new WaterMonter("u2r2");
        Monter m3 = new StoneMonster("r2r2");

        System.out.println(m1.attack());

        System.out.println(m2.attack());

        System.out.println(m3.attack());

        m1 = new StoneMonster("a2b2");
        System.out.println(m1.attack());

        Monter m4 = new Monter("u2r2");
        System.out.println(m4.attack());

    }
}
