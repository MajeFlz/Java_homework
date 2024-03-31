package lr3.task8;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {
    private Node head;

    // Методы с использованием цикла

    public void createHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void createTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.data).append(" ");
            current = current.next;
        }
        return result.toString();
    }

    public void addFirst(int data) {
        createHead(data);
    }

    public void addLast(int data) {
        createTail(data);
    }

    public void insert(int index, int data) {
        if (index == 0) {
            createHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public int removeFirst() {
        if (head == null) {
            throw new IllegalStateException("Список пуст");
        }
        int removedData = head.data;
        head = head.next;
        return removedData;
    }

    public int removeLast() {
        if (head == null) {
            throw new IllegalStateException("Список пуст");
        }
        if (head.next == null) {
            int removedData = head.data;
            head = null;
            return removedData;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        int removedData = current.next.data;
        current.next = null;
        return removedData;
    }

    public int remove(int index) {
        if (index == 0) {
            return removeFirst();
        }
        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            throw new IndexOutOfBoundsException("Индекс выходит за границы");
        }
        int removedData = current.next.data;
        current.next = current.next.next;
        return removedData;
    }

    // Методы с использованием рекурсии

    public void createHeadRec(int data) {
        head = createHeadRecHelper(head, data);
    }

    private Node createHeadRecHelper(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        current.next = createHeadRecHelper(current.next, data);
        return current;
    }

    public void createTailRec(int data) {
        head = createTailRecHelper(head, data);
    }

    private Node createTailRecHelper(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        current.next = createTailRecHelper(current.next, data);
        return current;
    }

    public String toStringRec() {
        return toStringRecHelper(head);
    }

    private String toStringRecHelper(Node current) {
        if (current == null) {
            return "";
        }
        return current.data + " " + toStringRecHelper(current.next);
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.createHead(1);
        list.createTail(2);
        list.createTail(3);
        list.createHead(0);

        System.out.println("Список: " + list.toString());

        list.addFirst(-1);
        list.addLast(4);
        System.out.println("Список после добавления первого и последнего элементов: " + list.toString());

        list.insert(2, 100);
        System.out.println("Список после вставки на позицию 2: " + list.toString());

        int removedFirst = list.removeFirst();
        System.out.println("Удален первый элемент: " + removedFirst + ". Список: " + list.toString());

        int removedLast = list.removeLast();
        System.out.println("Удален последний элемент: " + removedLast + ". Список: " + list.toString());

        int removedAtIndex = list.remove(2);
        System.out.println("Удален элемент на позиции 2: " + removedAtIndex + ". Список: " + list.toString());

        list.createHeadRec(-2);
        list.createTailRec(5);
        System.out.println("Список после рекурсивного добавления первого и последнего элементов: " + list.toStringRec());
    }
}