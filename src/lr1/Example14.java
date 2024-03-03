package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        double number = scanner.nextDouble();

        double prevNumber = number - 1;
        double nextNumber = number + 1;
        double fourthNumber = Math.pow(number + prevNumber + nextNumber, 2);

        System.out.println("Числа: " + prevNumber + ", " + number + ", " + nextNumber + ", " + fourthNumber);
    }
}
