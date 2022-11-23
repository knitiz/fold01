class A {
    String name = "A";

    public void meth1() {
        System.out.println("This is class " + name);
    }
}

class B extends A {
    public void meth2() {
        super.name = "B";
        super.meth1();

    }

}

public class soln02 {
    public static void main(String[] args) {
        B b = new B();
        
        b.meth2();

    }

}
