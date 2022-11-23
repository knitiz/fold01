import java.util.*;

public class soln02 {
    public static void main(String[] args) {

        int arr[] = { 10, 21, 21, 42, 52, 64, 34, 74, 75, 23 };
        int key = 43;
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                flag = 1;
                break;
            }

        }
        if (flag == 1)
            System.out.println("Element found out");
        else
            System.out.println("Element not found ");

    }
}
