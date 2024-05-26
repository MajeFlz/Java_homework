package lr7;

import java.io.File;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название файла: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        if (file.exists() && file.isFile()) {
            long fileSizeInBytes = file.length();
            System.out.println(STR."Размер файла: \{fileSizeInBytes} байт(а)");
        } else {
            System.out.println("Файл не найден или это не файл.");
        }

        scanner.close();
    }
}
