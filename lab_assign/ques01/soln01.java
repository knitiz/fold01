
class A {
    public void disp() {
        System.out.println("This is class A");
    }

    public void disp(String s) {
        System.out.println("This is class " + s);

    }
}

class soln01 {
    public static void main(String[] args) {
        A a = new A();
        a.disp();
        a.disp("helper");

    }
}
