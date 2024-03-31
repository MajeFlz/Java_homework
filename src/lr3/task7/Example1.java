package lr3.task7;

import lr3.Node;

public class Example1 {
    public static void main(String[] args) {

        Node head = null;

        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }

        Node ref = head;

        while (ref != null) {
            System.out.print(STR." \{ref.value}");
            ref = ref.next;
        }
    }
}
