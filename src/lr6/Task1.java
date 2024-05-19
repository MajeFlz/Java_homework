package lr6;

import java.time.LocalTime;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i < 10; i++) {
                System.out.println(STR."\{Thread.currentThread().getName()}: \{LocalTime.now()}");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 10; i < 20; i++) {
                System.out.println(STR."\{Thread.currentThread().getName()}: \{LocalTime.now()}");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}