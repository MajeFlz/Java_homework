package lr4;

public class Example10 {
    public static int m() {
        try {
            System.out.println("0");
        } finally {
            System.out.println("1");
            return 20;
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
