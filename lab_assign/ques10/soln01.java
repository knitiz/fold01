import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;

    }

}

class lList {
    Node start;

    public void append(int val) {
        if (start == null) {
            start = new Node(val);
        } else {
            Node temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(val);

        }
    }

    public void disp() {
        Node temp = start;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}

class soln01 {
    public static void main(String[] args) {

        lList obj = new lList();
        obj.append(10);
        obj.append(20);
        obj.append(30);
        obj.append(50);
        obj.append(7);
        obj.disp();

    }
}