
class A {
    public void disp() {
        System.out.println("This is class A");
    }
}

class B extends A {
    @Override
    public void disp() {
        super.disp();
        System.out.println("This is class B");
    }
}

class soln01 {
    public static void main(String[] args) {

        B b = new B();
        b.disp();

    }
}
