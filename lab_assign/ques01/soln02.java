
class fib {

    public fib(int n) {
        int val1 = 0;
        int val2 = 1;
        int val3 = 0;

        for (int i = 1; i <= n; i++) {
            if (i == 1)
                System.out.println(0);
            else if (i == 2)
                System.out.println(1);
            else {
                val3 = val1 + val2;
                System.out.println(val3);
                val1 = val2;
                val2 = val3;

            }

        }
    }

}

public class soln02 {
    public static void main(String[] args) {
        new fib(10);

    }

}
