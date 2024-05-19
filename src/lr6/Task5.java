package lr6;

public class Task5 {
    public static void main(String[] args) throws InterruptedException {
        int size = 1000000;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 2000000);
        }

        int numThreads = Runtime.getRuntime().availableProcessors();

        int chunkSize = (int) Math.ceil((double) array.length / numThreads);

        Thread[] threads = new Thread[numThreads];
        int[] maxValues = new int[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, array.length);
            final int threadIndex = i;

            threads[i] = new Thread(() -> {
                int localMax = array[start];
                for (int j = start + 1; j < end; j++) {
                    if (array[j] > localMax) {
                        localMax = array[j];
                    }
                }
                maxValues[threadIndex] = localMax;
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        int globalMax = maxValues[0];
        for (int i = 1; i < maxValues.length; i++) {
            if (maxValues[i] > globalMax) {
                globalMax = maxValues[i];
            }
        }

        System.out.println(STR."Максимальный элемент массива: \{globalMax}");
    }
}
