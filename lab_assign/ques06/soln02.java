
class A {
    int x = 10;

    public void meth() {
        int x = 20;
        System.out.println(x);
        System.out.println(this.x);

    }

}

public class soln02 {

    public static void main(String[] args) {
        A a = new A();
        a.meth();

    }

}
