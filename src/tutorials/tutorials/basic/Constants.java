package tutorials.tutorials.basic;

public class Constants {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static final Person P1 = new Person(" ");
    public static final int NUM_ENEMIES = 5;
    public static void main(String[] args) {

        //constants never change once a value is assign / usually static
        //by convention, constants are UPPER CASE

        // declare constants by using the "final" modifier
        // constants can be public because there's no harm in accessing variable directly if you can't alter it

        System.out.println(Math.PI);
        System.out.println(WIDTH);
    }
}
