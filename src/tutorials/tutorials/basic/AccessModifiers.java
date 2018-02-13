package tutorials.tutorials.basic;

public class AccessModifiers {
    public static void main(String[] args) {

    }

    //public visibility means that this method can be accessed anywhere in the program so long as you have an instance of that class to call it from
    public void doSomething() {
    }

    // private visibility means that this method CAN'T be accessed anywhere other than inside of this class
    private void doSomethingPrivete() {

    }

    // protected visibility means that this method can only by visible in classes inside this package
    // and from subclasses of this class
    protected void doSomethingProtected() {

    }

    // default visibility means that this method is only visible in this package
    void doSomethingDefault() {

    }
}
