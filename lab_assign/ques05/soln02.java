// package ques05;

class A {
    public int fact(int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }

}

public class soln02 {
    public static void main(String[] args) {
        A a = new A();
        int res = a.fact(5);
        System.out.println(res);

    }

}
