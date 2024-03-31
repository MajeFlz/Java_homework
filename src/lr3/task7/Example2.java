package lr3.task7;

import lr3.Node;

public class Example2 {

    public static void main(String[] args) {

        Node head = null;

        Node tail = null;

        for (int i = 9; i >= 0; i--) {
            Node newtail = new Node(i, null);
            if (head == null) {
                head = newtail;
            } else {
                tail.next = newtail;
            }
            tail = newtail;
        }

        Node ref = head;
        while (ref != null) {
            System.out.print(STR." \{ref.value}");
            ref = ref.next;
        }
    }

}
