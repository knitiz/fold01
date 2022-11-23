
import java.util.*;

class A extends Thread

{
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("This is run method");
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

}

public class soln01 {
    public static void main(String[] args) {
        A obj = new A();
        new Thread(obj).start();
        System.out.println("hello");
    }

}
