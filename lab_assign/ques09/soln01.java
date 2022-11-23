// package ques09;

public class soln01 {
    public static void main(String[] args) {
        try {
            try {
                String s = null;
                System.out.println(s.length());

            } catch (Exception e) {
                System.out.println(e);
            }

            try {
                int arr[] = new int[10];
                System.out.println(arr[10]);

            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println("Exception handled sucessfully ");
        } finally {
            System.out.println("This is finally Block");
        }
    }

}
