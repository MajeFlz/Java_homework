package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int rows;
        int cols;

        try {
            System.out.print("Введите количество строк матрицы: ");
            rows = in.nextInt();
            System.out.print("Введите количество столбцов матрицы: ");
            cols = in.nextInt();
            int[][] matrix = new int[rows][cols];

            System.out.println("Введите элементы матрицы:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = in.nextInt();
                }
            }

            System.out.print(STR."Введите номер столбца для вывода (от 0 до \{cols - 1}): ");
            int colIndex = in.nextInt();

            if (colIndex < 0 || colIndex >= cols) {
                throw new IndexOutOfBoundsException("Введенный номер столбца выходит за пределы размерности матрицы.");
            }

            System.out.println(STR."Столбец \{colIndex}:");
            for (int i = 0; i < rows; i++) {
                System.out.println(matrix[i][colIndex]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода: Введено некорректное значение. Ожидалось число.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        in.close();
    }
}
