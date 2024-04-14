package lr4;

public class Example8 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("Caught exception in m(): " + e);
            return (-1); //значение, которое сигнализирует об ошибке
        } finally {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}