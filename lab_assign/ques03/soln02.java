
class A {
    static int a = 10;
    static {
        System.out.println("This is static block");
    }

    public static void disp() {
        System.out.println("This is display method");
    }
}

public class soln02 {

    public static void main(String[] args) {
        System.out.println(A.a);
        A.disp();
        System.out.println("hello");

    }

}
