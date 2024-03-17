package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк и столбцов:");
        int rows = in.nextInt();
        int cols = in.nextInt();

        int[][] snakeArray = new int[rows][cols];

        int number = 0;

        for (int i = 0; i < rows; ++i) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; ++j) {
                    snakeArray[i][j] = number++;
                }
            } else {
                for (int j = cols - 1; j >= 0; --j) {
                    snakeArray[i][j] = number++;
                }
            }
        }

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                System.out.print(snakeArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
