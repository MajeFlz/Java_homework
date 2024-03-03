package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш год рождения: ");
        int yearOfBirth = scanner.nextInt();

        int currentYear = Year.now().getValue();

        int age = currentYear - yearOfBirth;

        System.out.println("В этом году вам - " + age + " лет.");
    }
}
