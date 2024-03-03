package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();

        double sum = number1 + number2;
        double difference = number1 - number2;

        System.out.println("Сумма чисел: " + sum);
        System.out.println("Разность чисел: " + difference);
    }
}
