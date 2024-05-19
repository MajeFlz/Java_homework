package lr6;

public class Task4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(new NumberPrinter(i));
            thread.start();
        }
    }

    private record NumberPrinter(int threadNumber) implements Runnable {

        @Override
            public void run() {
                System.out.println(STR."Поток №\{threadNumber}");
            }
        }
}