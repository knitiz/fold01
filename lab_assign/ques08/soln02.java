import java.util.*;

class helper {
    public void sort(int arr[], int len) {

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}

class soln02 {
    public static void main(String[] args) {
        helper hp = new helper();
        int arr[] = { 10, 31, 12, 53, 52, 76, 33, 21, 91, 42 };
        int len = arr.length;
        System.out.println(len);
        hp.sort(arr, len);

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}