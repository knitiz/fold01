
abstract class A {
    public abstract void meth();
}

class B extends A {

    public void meth() {
        System.out.println("This is class B extending from A");
    }
}

public class soln02 {

    public static void main(String[] args) {
        B b = new B();
        b.meth();

    }

}
