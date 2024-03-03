package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        int currentYear = Year.now().getValue();

        int yearOfBirth = currentYear - age;

        System.out.println("Год вашего рождения: " + yearOfBirth);
    }
}
