package tutorials.tutorials.basic;

public class Scope {

    //declare variables outside of the m()
    static int x; // declaring variable x
    public static void main(String[] args) {
        //scope - zakres
        // every m() (main too) can have local variables - are local to m() in which they were declared
        //that means can't access variables declared in a m() from many other m()
        x = 5; // assign value 5 to variable x
        System.out.println(x);
        doSomethng();
        System.out.println(x);

    }

    static void doSomethng() {
        x = 10;
    }

    static void doSomethingLocally() {
        int y = 50;
    }
}
