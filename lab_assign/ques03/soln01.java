
class stack {
    int arr[] = new int[10];
    int max_size = arr.length;
    int k = -1;

    public void push(int val) {
        if (k != max_size) {
            k++;
            arr[k] = val;
            System.out.println("Successfully value Entered");
        }

        else {
            System.out.println("Running out of space");
        }

    }

    public void pop() {
        if (k == -1) {
            System.out.println("Already Empty");
        } else {
            k--;
            System.out.println("Successfully popped out");
        }

    }

    public void disp() {

        for (int i = 0; i <= k; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}

public class soln01 {
    public static void main(String[] args) {
        stack st = new stack();
        st.push(10);
        st.pop();
        st.push(20);
        st.push(30);
        st.push(40);
        st.pop();
        st.disp();

    }

}
