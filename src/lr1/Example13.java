package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();

        System.out.println("Сумма чисел: " + Double.sum(number1, number2));
    }
}
