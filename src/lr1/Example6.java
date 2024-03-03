package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите вашу фамилию: ");
        String secondName = scanner.nextLine();

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите ваше отчество: ");
        String patronymic = scanner.nextLine();

        System.out.println("Hello " + secondName + " " + name + " " + patronymic);
    }
}
