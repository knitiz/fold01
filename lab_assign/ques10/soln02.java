abstract class A {
    public abstract void meth();

    public void meth2() {
        System.out.println("This is method02");
    }

}

class helper extends A {
    public void meth() {
        System.out.println("This is method01 from Abstract class");
    }
}

class soln02 {
    public static void main(String[] args) {
        helper obj = new helper();
        obj.meth();
        obj.meth2();
    }
}