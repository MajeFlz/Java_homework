package lr1;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название текущего дня недели: ");
        String nameDayOfWeek = scanner.nextLine();

        System.out.print("Введите название месяца: ");
        String month = scanner.nextLine();

        System.out.print("Введите номер дня в месяце: ");
        int dayOfMonth = scanner.nextInt();

        System.out.println(nameDayOfWeek + ", " + dayOfMonth + "," + month);
    }
}
