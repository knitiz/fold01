
public class soln01 {

    public static void meth() throws IllegalAccessException {
        System.out.println("inside meth");
        throw new IllegalAccessException("iException");
    }

    public static void main(String[] args) {

        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        int arr[] = new int[10];
        try {
            System.out.println(arr[10]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try {
            meth();
        } catch (Exception e) {

            System.out.println(e);
        }
    }

}
